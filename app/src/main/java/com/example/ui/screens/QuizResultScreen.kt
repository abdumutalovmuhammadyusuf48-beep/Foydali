package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.model.QuizResult
import com.example.ui.components.BismillahHeader
import com.example.ui.components.IslamicCard
import com.example.ui.components.IslamicOrnamentDivider
import com.example.ui.theme.*

@Composable
fun QuizResultScreen(
  result: QuizResult,
  onRetake: () -> Unit,
  onReviewMistakes: () -> Unit,
  onGoHome: () -> Unit
) {
  BackHandler { onGoHome() }
  val scrollState = rememberScrollState()

  Scaffold(
    containerColor = MaloshniyCream
  ) { paddingValues ->
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)
        .verticalScroll(scrollState)
        .padding(horizontal = 20.dp, vertical = 24.dp),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      BismillahHeader()

      Spacer(modifier = Modifier.height(12.dp))

      Text(
        text = "Test Natijasi",
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        color = IslamicGreenDark
      )

      Text(
        text = result.chapterTitle,
        fontSize = 14.sp,
        color = TextSecondary,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(top = 4.dp)
      )

      IslamicOrnamentDivider()

      // Main Result Card with Score Circle
      IslamicCard(
        backgroundColor = MaloshniyCard,
        borderColor = IslamicGoldBorder
      ) {
        Column(
          modifier = Modifier.fillMaxWidth(),
          horizontalAlignment = Alignment.CenterHorizontally
        ) {
          Surface(
            shape = RoundedCornerShape(100.dp),
            color = if (result.percentage >= 70) IslamicGreenContainer else WrongAnswerContainer,
            modifier = Modifier.size(110.dp)
          ) {
            Box(contentAlignment = Alignment.Center) {
              Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                  text = "${result.percentage}%",
                  fontSize = 28.sp,
                  fontWeight = FontWeight.Bold,
                  color = if (result.percentage >= 70) IslamicGreenPrimary else WrongAnswerRed
                )
                Text(
                  text = "${result.correctAnswers}/${result.totalQuestions}",
                  fontSize = 12.sp,
                  color = TextSecondary
                )
              }
            }
          }

          Spacer(modifier = Modifier.height(14.dp))

          Text(
            text = result.rankTitle,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = IslamicGreenPrimary,
            textAlign = TextAlign.Center
          )

          Spacer(modifier = Modifier.height(16.dp))

          // Statistics Row
          Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
          ) {
            ResultStat(
              icon = Icons.Default.CheckCircle,
              color = CorrectAnswerGreen,
              title = "To'g'ri",
              value = "${result.correctAnswers}"
            )
            ResultStat(
              icon = Icons.Default.Close,
              color = WrongAnswerRed,
              title = "Xato",
              value = "${result.wrongAnswers}"
            )
            ResultStat(
              icon = Icons.Default.Timer,
              color = IslamicGold,
              title = "Vaqt",
              value = "${result.timeSpentSeconds}s"
            )
          }
        }
      }

      Spacer(modifier = Modifier.height(24.dp))

      // Action Buttons
      Button(
        onClick = onRetake,
        modifier = Modifier
          .fillMaxWidth()
          .height(50.dp)
          .testTag("result_retake_button"),
        shape = RoundedCornerShape(14.dp),
        colors = ButtonDefaults.buttonColors(containerColor = IslamicGreenPrimary)
      ) {
        Icon(Icons.Default.Refresh, contentDescription = null, tint = MaloshniyCream)
        Spacer(modifier = Modifier.width(8.dp))
        Text(
          text = "Testni qayta topshirish",
          fontSize = 15.sp,
          fontWeight = FontWeight.Bold,
          color = MaloshniyCream
        )
      }

      if (result.wrongAnswers > 0) {
        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
          onClick = onReviewMistakes,
          modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .testTag("result_review_mistakes_button"),
          shape = RoundedCornerShape(14.dp),
          colors = ButtonDefaults.outlinedButtonColors(contentColor = IslamicGreenPrimary),
          border = androidx.compose.foundation.BorderStroke(1.5.dp, IslamicGreenPrimary)
        ) {
          Text(
            text = "Xatolar ustida ishlash (${result.wrongAnswers})",
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold
          )
        }
      }

      Spacer(modifier = Modifier.height(12.dp))

      TextButton(
        onClick = onGoHome,
        modifier = Modifier
          .fillMaxWidth()
          .height(48.dp)
          .testTag("result_go_home_button")
      ) {
        Icon(Icons.Default.Home, contentDescription = null, tint = IslamicGreenSecondary)
        Spacer(modifier = Modifier.width(8.dp))
        Text(
          text = "Bosh sahifaga qaytish",
          fontSize = 15.sp,
          color = IslamicGreenSecondary
        )
      }

      Spacer(modifier = Modifier.height(24.dp))
    }
  }
}

@Composable
private fun ResultStat(
  icon: androidx.compose.ui.graphics.vector.ImageVector,
  color: androidx.compose.ui.graphics.Color,
  title: String,
  value: String
) {
  Column(horizontalAlignment = Alignment.CenterHorizontally) {
    Icon(
      imageVector = icon,
      contentDescription = null,
      tint = color,
      modifier = Modifier.size(24.dp)
    )
    Spacer(modifier = Modifier.height(4.dp))
    Text(
      text = value,
      fontSize = 17.sp,
      fontWeight = FontWeight.Bold,
      color = TextPrimary
    )
    Text(
      text = title,
      fontSize = 11.sp,
      color = TextSecondary
    )
  }
}
