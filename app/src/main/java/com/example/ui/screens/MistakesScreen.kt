package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.QuestionsRepository
import com.example.data.UserProgressManager
import com.example.model.Question
import com.example.ui.components.DifficultyBadge
import com.example.ui.components.IslamicCard
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MistakesScreen(
  onBack: () -> Unit,
  onStartQuiz: (List<Question>) -> Unit
) {
  BackHandler { onBack() }
  val context = LocalContext.current
  val progressManager = remember { UserProgressManager.getInstance(context) }
  val mistakeIds by progressManager.mistakeIds.collectAsState()

  val mistakeQuestions = remember(mistakeIds) {
    QuestionsRepository.getQuestionsByIds(mistakeIds)
  }

  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Column {
            Text(
              text = "Xatolar Ustida Ishlash",
              fontSize = 17.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenDark
            )
            Text(
              text = "${mistakeQuestions.size} ta xato qilingan savol",
              fontSize = 12.sp,
              color = TextSecondary
            )
          }
        },
        navigationIcon = {
          IconButton(
            onClick = onBack,
            modifier = Modifier.testTag("mistakes_back_button")
          ) {
            Icon(
              imageVector = Icons.AutoMirrored.Filled.ArrowBack,
              contentDescription = "Ortga",
              tint = IslamicGreenPrimary
            )
          }
        },
        actions = {
          if (mistakeQuestions.isNotEmpty()) {
            IconButton(
              onClick = { progressManager.clearAllMistakes() },
              modifier = Modifier.testTag("clear_all_mistakes_button")
            ) {
              Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Barchasini tozalash",
                tint = WrongAnswerRed
              )
            }
          }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaloshniyCream)
      )
    },
    bottomBar = {
      if (mistakeQuestions.isNotEmpty()) {
        Surface(
          color = MaloshniyCream,
          tonalElevation = 4.dp,
          modifier = Modifier.padding(16.dp)
        ) {
          Button(
            onClick = { onStartQuiz(mistakeQuestions) },
            modifier = Modifier
              .fillMaxWidth()
              .height(50.dp)
              .testTag("start_mistakes_quiz_button"),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = IslamicGreenPrimary)
          ) {
            Icon(Icons.Default.PlayArrow, contentDescription = null, tint = MaloshniyCream)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
              text = "Xatolar bo'yicha qayta sinov",
              fontSize = 15.sp,
              fontWeight = FontWeight.Bold,
              color = MaloshniyCream
            )
          }
        }
      }
    },
    containerColor = MaloshniyCream
  ) { paddingValues ->
    if (mistakeQuestions.isEmpty()) {
      Box(
        modifier = Modifier
          .fillMaxSize()
          .padding(paddingValues),
        contentAlignment = Alignment.Center
      ) {
        Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          modifier = Modifier.padding(24.dp)
        ) {
          Icon(
            imageVector = Icons.Default.Check,
            contentDescription = null,
            tint = IslamicGreenPrimary,
            modifier = Modifier.size(48.dp)
          )
          Spacer(modifier = Modifier.height(12.dp))
          Text(
            text = "Ajoyib! Xatolar yo'q",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = IslamicGreenDark
          )
          Spacer(modifier = Modifier.height(6.dp))
          Text(
            text = "Test topshirish davomida xato javob berilgan yoki vaqti tugagan savollar shu yerda to'planadi",
            fontSize = 13.sp,
            color = TextSecondary,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
          )
        }
      }
    } else {
      LazyColumn(
        modifier = Modifier
          .fillMaxSize()
          .padding(paddingValues)
          .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(vertical = 12.dp)
      ) {
        items(mistakeQuestions, key = { it.id }) { question ->
          IslamicCard(
            backgroundColor = MaloshniyCard,
            borderColor = WrongAnswerContainer
          ) {
            Row(
              modifier = Modifier.fillMaxWidth(),
              horizontalArrangement = Arrangement.SpaceBetween,
              verticalAlignment = Alignment.CenterVertically
            ) {
              DifficultyBadge(difficulty = question.difficulty)

              IconButton(
                onClick = { progressManager.removeMistake(question.id) },
                modifier = Modifier.size(32.dp)
              ) {
                Icon(
                  imageVector = Icons.Default.Check,
                  contentDescription = "O'zlashtirildi",
                  tint = CorrectAnswerGreen,
                  modifier = Modifier.size(20.dp)
                )
              }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
              text = question.questionText,
              fontSize = 14.sp,
              fontWeight = FontWeight.SemiBold,
              color = TextPrimary
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
              text = "To'g'ri javob: ${question.options[question.correctIndex]}",
              fontSize = 12.sp,
              fontWeight = FontWeight.Bold,
              color = CorrectAnswerGreen
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
              text = "Sharh: ${question.explanation}",
              fontSize = 12.sp,
              lineHeight = 18.sp,
              color = TextSecondary
            )
          }
        }
      }
    }
  }
}
