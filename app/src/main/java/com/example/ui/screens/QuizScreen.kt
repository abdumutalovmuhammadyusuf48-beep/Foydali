package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TimerOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.UserProgressManager
import com.example.model.Question
import com.example.model.QuizResult
import com.example.ui.components.DifficultyBadge
import com.example.ui.components.IslamicCard
import com.example.ui.components.IslamicCountdownTimer
import com.example.ui.components.IslamicOrnamentDivider
import com.example.ui.theme.*
import kotlinx.coroutines.delay

private const val QUESTION_TIMER_SECONDS = 30

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(
  questions: List<Question>,
  title: String,
  onBack: () -> Unit,
  onFinishQuiz: (QuizResult) -> Unit
) {
  val context = LocalContext.current
  val progressManager = remember { UserProgressManager.getInstance(context) }
  val bookmarkedIds by progressManager.bookmarkedIds.collectAsState()

  var currentIndex by remember { mutableIntStateOf(0) }
  var correctCount by remember { mutableIntStateOf(0) }
  var wrongCount by remember { mutableIntStateOf(0) }
  var selectedAnswerIndex by remember { mutableStateOf<Int?>(null) }
  var isAnswerSubmitted by remember { mutableStateOf(false) }
  var isTimedOut by remember { mutableStateOf(false) }
  var showExitDialog by remember { mutableStateOf(false) }
  var timerEnabled by remember { mutableStateOf(true) }
  var remainingSeconds by remember { mutableIntStateOf(QUESTION_TIMER_SECONDS) }
  val startTime = remember { System.currentTimeMillis() }

  BackHandler { showExitDialog = true }

  val currentQuestion = questions.getOrNull(currentIndex)

  // 30-Second Countdown Timer Coroutine
  LaunchedEffect(currentIndex, isAnswerSubmitted, timerEnabled) {
    if (currentQuestion == null) return@LaunchedEffect
    if (!timerEnabled || isAnswerSubmitted) return@LaunchedEffect

    remainingSeconds = QUESTION_TIMER_SECONDS
    isTimedOut = false

    while (remainingSeconds > 0 && !isAnswerSubmitted) {
      delay(1000L)
      if (!isAnswerSubmitted) {
        remainingSeconds -= 1
      }
    }

    // When timer hits 0 and no answer was submitted
    if (remainingSeconds == 0 && !isAnswerSubmitted) {
      isTimedOut = true
      isAnswerSubmitted = true
      selectedAnswerIndex = -1 // timeout indicator
      wrongCount++
      progressManager.recordMistake(currentQuestion.id)

      // Automatically move to the next question as requested
      delay(1400L)
      if (currentIndex < questions.size - 1) {
        currentIndex++
        selectedAnswerIndex = null
        isAnswerSubmitted = false
        isTimedOut = false
        remainingSeconds = QUESTION_TIMER_SECONDS
      } else {
        val totalTime = (System.currentTimeMillis() - startTime) / 1000
        progressManager.recordQuizCompletion(correctCount, questions.size)
        onFinishQuiz(
          QuizResult(
            totalQuestions = questions.size,
            correctAnswers = correctCount,
            wrongAnswers = wrongCount,
            timeSpentSeconds = totalTime,
            chapterTitle = title
          )
        )
      }
    }
  }

  fun submitAnswer(index: Int) {
    if (isAnswerSubmitted || currentQuestion == null) return
    selectedAnswerIndex = index
    isAnswerSubmitted = true

    if (index == currentQuestion.correctIndex) {
      correctCount++
    } else {
      wrongCount++
      progressManager.recordMistake(currentQuestion.id)
    }
  }

  fun nextQuestion() {
    if (currentIndex < questions.size - 1) {
      currentIndex++
      selectedAnswerIndex = null
      isAnswerSubmitted = false
      isTimedOut = false
      remainingSeconds = QUESTION_TIMER_SECONDS
    } else {
      val totalTime = (System.currentTimeMillis() - startTime) / 1000
      progressManager.recordQuizCompletion(correctCount, questions.size)
      onFinishQuiz(
        QuizResult(
          totalQuestions = questions.size,
          correctAnswers = correctCount,
          wrongAnswers = wrongCount,
          timeSpentSeconds = totalTime,
          chapterTitle = title
        )
      )
    }
  }

  if (currentQuestion == null) {
    Box(
      modifier = Modifier
        .fillMaxSize()
        .background(MaloshniyCream),
      contentAlignment = Alignment.Center
    ) {
      Text("Savollar topilmadi", color = TextPrimary)
    }
    return
  }

  val isBookmarked = bookmarkedIds.contains(currentQuestion.id)

  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Column {
            Text(
              text = title,
              fontSize = 16.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenDark,
              maxLines = 1
            )
            Text(
              text = "Savol ${currentIndex + 1} / ${questions.size}",
              fontSize = 12.sp,
              color = TextSecondary
            )
          }
        },
        navigationIcon = {
          IconButton(
            onClick = { showExitDialog = true },
            modifier = Modifier.testTag("quiz_back_button")
          ) {
            Icon(
              imageVector = Icons.AutoMirrored.Filled.ArrowBack,
              contentDescription = "Chiqish",
              tint = IslamicGreenPrimary
            )
          }
        },
        actions = {
          // Timer toggle button
          IconButton(
            onClick = { timerEnabled = !timerEnabled },
            modifier = Modifier.testTag("toggle_timer_button")
          ) {
            Icon(
              imageVector = if (timerEnabled) Icons.Default.Timer else Icons.Default.TimerOff,
              contentDescription = if (timerEnabled) "Taymer yoqilgan" else "Taymer o'chirilgan",
              tint = if (timerEnabled) IslamicGreenPrimary else TextLight
            )
          }
          // Bookmark button
          IconButton(
            onClick = { progressManager.toggleBookmark(currentQuestion.id) },
            modifier = Modifier.testTag("quiz_bookmark_button")
          ) {
            Icon(
              imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
              contentDescription = "Saqlash",
              tint = if (isBookmarked) IslamicGold else IslamicGreenPrimary
            )
          }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaloshniyCream)
      )
    },
    containerColor = MaloshniyCream
  ) { paddingValues ->
    val scrollState = rememberScrollState()

    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)
        .verticalScroll(scrollState)
        .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
      // Progress Bar
      LinearProgressIndicator(
        progress = { (currentIndex + 1).toFloat() / questions.size.toFloat() },
        modifier = Modifier
          .fillMaxWidth()
          .height(6.dp)
          .clip(RoundedCornerShape(3.dp)),
        color = IslamicGreenPrimary,
        trackColor = MaloshniyBorder
      )

      Spacer(modifier = Modifier.height(14.dp))

      // Top Header Card with Chapter & Timer
      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
      ) {
        Column(modifier = Modifier.weight(1f)) {
          Text(
            text = currentQuestion.chapterTitle,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
            color = IslamicGreenSecondary
          )
          Spacer(modifier = Modifier.height(4.dp))
          DifficultyBadge(difficulty = currentQuestion.difficulty)
        }

        if (timerEnabled) {
          IslamicCountdownTimer(
            remainingSeconds = remainingSeconds,
            totalSeconds = QUESTION_TIMER_SECONDS,
            modifier = Modifier.padding(start = 12.dp)
          )
        }
      }

      // Timeout banner notice
      AnimatedVisibility(visible = isTimedOut) {
        Card(
          modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
            .testTag("timeout_notice_card"),
          colors = CardDefaults.cardColors(containerColor = WrongAnswerContainer),
          shape = RoundedCornerShape(12.dp)
        ) {
          Row(
            modifier = Modifier
              .fillMaxWidth()
              .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
          ) {
            Icon(
              imageVector = Icons.Default.TimerOff,
              contentDescription = null,
              tint = WrongAnswerRed
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
              text = "30 soniya vaqt tugadi! Avtomatik keyingi savolga o'tilmoqda...",
              fontSize = 13.sp,
              fontWeight = FontWeight.Bold,
              color = WrongAnswerRed
            )
          }
        }
      }

      Spacer(modifier = Modifier.height(14.dp))

      // Question Card
      IslamicCard(
        backgroundColor = MaloshniyCard,
        borderColor = MaloshniyBorder
      ) {
        Text(
          text = currentQuestion.questionText,
          fontSize = 16.sp,
          fontWeight = FontWeight.SemiBold,
          lineHeight = 24.sp,
          color = TextPrimary,
          modifier = Modifier.testTag("quiz_question_text")
        )
      }

      Spacer(modifier = Modifier.height(14.dp))

      // Options List
      currentQuestion.options.forEachIndexed { index, optionText ->
        val isSelected = selectedAnswerIndex == index
        val isCorrect = index == currentQuestion.correctIndex

        val (containerColor, borderColor, textColor) = when {
          !isAnswerSubmitted -> Triple(MaloshniyCard, MaloshniyBorder, TextPrimary)
          isCorrect -> Triple(CorrectAnswerContainer, CorrectAnswerGreen, CorrectAnswerGreen)
          isSelected -> Triple(WrongAnswerContainer, WrongAnswerRed, WrongAnswerRed)
          else -> Triple(MaloshniyCard, MaloshniyBorder, TextSecondary)
        }

        Card(
          modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
            .clip(RoundedCornerShape(12.dp))
            .border(1.5.dp, borderColor, RoundedCornerShape(12.dp))
            .clickable(enabled = !isAnswerSubmitted) { submitAnswer(index) }
            .testTag("quiz_option_$index"),
          colors = CardDefaults.cardColors(containerColor = containerColor),
          shape = RoundedCornerShape(12.dp)
        ) {
          Row(
            modifier = Modifier
              .fillMaxWidth()
              .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
          ) {
            // Option letter circle
            val optionLetter = ('A' + index).toString()
            Surface(
              modifier = Modifier.size(32.dp),
              shape = RoundedCornerShape(8.dp),
              color = if (isAnswerSubmitted && isCorrect) CorrectAnswerGreen
              else if (isAnswerSubmitted && isSelected) WrongAnswerRed
              else MaloshniySurfaceVariant
            ) {
              Box(contentAlignment = Alignment.Center) {
                Text(
                  text = optionLetter,
                  fontWeight = FontWeight.Bold,
                  fontSize = 14.sp,
                  color = if (isAnswerSubmitted && (isCorrect || isSelected)) Color.White else IslamicGreenPrimary
                )
              }
            }

            Spacer(modifier = Modifier.width(12.dp))

            Text(
              text = optionText,
              fontSize = 14.sp,
              fontWeight = if (isAnswerSubmitted && isCorrect) FontWeight.Bold else FontWeight.Normal,
              color = textColor,
              modifier = Modifier.weight(1f)
            )

            if (isAnswerSubmitted) {
              if (isCorrect) {
                Icon(
                  imageVector = Icons.Default.CheckCircle,
                  contentDescription = "To'g'ri",
                  tint = CorrectAnswerGreen,
                  modifier = Modifier.size(20.dp)
                )
              } else if (isSelected) {
                Icon(
                  imageVector = Icons.Default.Close,
                  contentDescription = "Noto'g'ri",
                  tint = WrongAnswerRed,
                  modifier = Modifier.size(20.dp)
                )
              }
            }
          }
        }
      }

      // Detailed Explanation Card (Revealed after answer submission or timeout)
      AnimatedVisibility(
        visible = isAnswerSubmitted,
        enter = fadeIn()
      ) {
        Column(modifier = Modifier.padding(top = 14.dp)) {
          IslamicCard(
            backgroundColor = MaloshniyCard,
            borderColor = IslamicGoldBorder
          ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
              Icon(
                imageVector = Icons.Default.Info,
                contentDescription = null,
                tint = IslamicGold,
                modifier = Modifier.size(20.dp)
              )
              Spacer(modifier = Modifier.width(8.dp))
              Text(
                text = "Kitobdagi Asosi va Sharhi:",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = IslamicGreenDark
              )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
              text = currentQuestion.explanation,
              fontSize = 13.sp,
              lineHeight = 20.sp,
              color = TextPrimary
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
              text = "Manba: ${currentQuestion.bookReference}",
              fontSize = 11.sp,
              fontWeight = FontWeight.Medium,
              color = IslamicGold
            )
          }

          Spacer(modifier = Modifier.height(14.dp))

          // Next question button
          Button(
            onClick = { nextQuestion() },
            modifier = Modifier
              .fillMaxWidth()
              .height(50.dp)
              .testTag("quiz_next_button"),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = IslamicGreenPrimary)
          ) {
            Text(
              text = if (currentIndex < questions.size - 1) "Keyingi savol" else "Natijani ko'rish",
              fontSize = 15.sp,
              fontWeight = FontWeight.Bold,
              color = MaloshniyCream
            )
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
              imageVector = Icons.Default.ArrowForward,
              contentDescription = null,
              tint = MaloshniyCream
            )
          }
        }
      }

      Spacer(modifier = Modifier.height(24.dp))
    }
  }

  // Exit Confirmation Dialog
  if (showExitDialog) {
    AlertDialog(
      onDismissRequest = { showExitDialog = false },
      title = {
        Text("Testdan chiqish", fontWeight = FontWeight.Bold, color = IslamicGreenDark)
      },
      text = {
        Text("Test yakunlanmagan. Hozir chiqsangiz, joriy natijalar saqlanmaydi. Chiqishni xohlaysizmi?")
      },
      confirmButton = {
        TextButton(
          onClick = {
            showExitDialog = false
            onBack()
          },
          modifier = Modifier.testTag("dialog_confirm_exit_button")
        ) {
          Text("Chiqish", color = WrongAnswerRed, fontWeight = FontWeight.Bold)
        }
      },
      dismissButton = {
        TextButton(onClick = { showExitDialog = false }) {
          Text("Davom etish", color = IslamicGreenPrimary)
        }
      },
      containerColor = MaloshniyCard
    )
  }
}
