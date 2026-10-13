package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.BookmarkRemove
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
fun BookmarksScreen(
  onBack: () -> Unit,
  onStartQuiz: (List<Question>) -> Unit
) {
  BackHandler { onBack() }
  val context = LocalContext.current
  val progressManager = remember { UserProgressManager.getInstance(context) }
  val bookmarkedIds by progressManager.bookmarkedIds.collectAsState()

  val bookmarkedQuestions = remember(bookmarkedIds) {
    QuestionsRepository.getQuestionsByIds(bookmarkedIds)
  }

  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Column {
            Text(
              text = "Saqlangan Savollar",
              fontSize = 17.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenDark
            )
            Text(
              text = "${bookmarkedQuestions.size} ta savol",
              fontSize = 12.sp,
              color = TextSecondary
            )
          }
        },
        navigationIcon = {
          IconButton(
            onClick = onBack,
            modifier = Modifier.testTag("bookmarks_back_button")
          ) {
            Icon(
              imageVector = Icons.AutoMirrored.Filled.ArrowBack,
              contentDescription = "Ortga",
              tint = IslamicGreenPrimary
            )
          }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaloshniyCream)
      )
    },
    bottomBar = {
      if (bookmarkedQuestions.isNotEmpty()) {
        Surface(
          color = MaloshniyCream,
          tonalElevation = 4.dp,
          modifier = Modifier.padding(16.dp)
        ) {
          Button(
            onClick = { onStartQuiz(bookmarkedQuestions) },
            modifier = Modifier
              .fillMaxWidth()
              .height(50.dp)
              .testTag("start_bookmarks_quiz_button"),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = IslamicGreenPrimary)
          ) {
            Icon(Icons.Default.PlayArrow, contentDescription = null, tint = MaloshniyCream)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
              text = "Saqlanganlar bo'yicha test topshirish",
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
    if (bookmarkedQuestions.isEmpty()) {
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
          Text(
            text = "Hozircha saqlangan savollar yo'q",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = TextSecondary
          )
          Spacer(modifier = Modifier.height(8.dp))
          Text(
            text = "Test topshirayotganda yoki qomusda qiziq fiqhiy savollarni belgi qo'yib saqlab boring",
            fontSize = 13.sp,
            color = TextLight,
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
        items(bookmarkedQuestions, key = { it.id }) { question ->
          IslamicCard(
            backgroundColor = MaloshniyCard,
            borderColor = MaloshniyBorder
          ) {
            Row(
              modifier = Modifier.fillMaxWidth(),
              horizontalArrangement = Arrangement.SpaceBetween,
              verticalAlignment = Alignment.CenterVertically
            ) {
              DifficultyBadge(difficulty = question.difficulty)

              IconButton(
                onClick = { progressManager.toggleBookmark(question.id) },
                modifier = Modifier.size(32.dp)
              ) {
                Icon(
                  imageVector = Icons.Default.BookmarkRemove,
                  contentDescription = "O'chirish",
                  tint = WrongAnswerRed,
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
              fontWeight = FontWeight.Medium,
              color = CorrectAnswerGreen
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
              text = question.explanation,
              fontSize = 12.sp,
              color = TextSecondary,
              maxLines = 3
            )
          }
        }
      }
    }
  }
}
