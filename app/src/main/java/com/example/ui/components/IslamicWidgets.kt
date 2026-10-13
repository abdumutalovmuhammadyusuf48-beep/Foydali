package com.example.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.model.QuestionDifficulty
import com.example.ui.theme.*

@Composable
fun BismillahHeader(
  modifier: Modifier = Modifier,
  color: Color = IslamicGold
) {
  Column(
    modifier = modifier.fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(
      text = "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ",
      fontSize = 20.sp,
      fontWeight = FontWeight.SemiBold,
      color = color,
      textAlign = TextAlign.Center,
      modifier = Modifier.padding(vertical = 4.dp)
    )
  }
}

@Composable
fun IslamicOrnamentDivider(
  modifier: Modifier = Modifier,
  color: Color = IslamicGoldBorder
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .padding(vertical = 8.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Center
  ) {
    Box(
      modifier = Modifier
        .weight(1f)
        .height(1.dp)
        .background(color)
    )
    Text(
      text = " ❖ ✦ ❖ ",
      color = IslamicGold,
      fontSize = 13.sp,
      modifier = Modifier.padding(horizontal = 8.dp)
    )
    Box(
      modifier = Modifier
        .weight(1f)
        .height(1.dp)
        .background(color)
    )
  }
}

/**
 * 30-Second Countdown Timer with animated circular progress and color transition
 */
@Composable
fun IslamicCountdownTimer(
  remainingSeconds: Int,
  totalSeconds: Int = 30,
  modifier: Modifier = Modifier,
  size: Dp = 54.dp,
  strokeWidth: Dp = 4.dp
) {
  val progress = (remainingSeconds.coerceAtLeast(0).toFloat() / totalSeconds.coerceAtLeast(1).toFloat()).coerceIn(0f, 1f)
  val animatedProgress by animateFloatAsState(
    targetValue = progress,
    label = "TimerProgress"
  )

  val timerColor by animateColorAsState(
    targetValue = when {
      remainingSeconds <= 5 -> WrongAnswerRed
      remainingSeconds <= 10 -> IslamicGold
      else -> IslamicGreenPrimary
    },
    label = "TimerColor"
  )

  Box(
    modifier = modifier
      .size(size)
      .testTag("quiz_timer_box"),
    contentAlignment = Alignment.Center
  ) {
    Canvas(modifier = Modifier.fillMaxSize()) {
      // Background track
      drawCircle(
        color = MaloshniyBorder,
        style = Stroke(width = strokeWidth.toPx())
      )
      // Animated remaining arc
      drawArc(
        color = timerColor,
        startAngle = -90f,
        sweepAngle = 360f * animatedProgress,
        useCenter = false,
        style = Stroke(
          width = strokeWidth.toPx(),
          cap = StrokeCap.Round
        )
      )
    }

    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
    ) {
      Text(
        text = "$remainingSeconds",
        fontSize = 17.sp,
        fontWeight = FontWeight.Bold,
        color = timerColor,
        modifier = Modifier.testTag("timer_remaining_text")
      )
      Text(
        text = "soniya",
        fontSize = 9.sp,
        fontWeight = FontWeight.Medium,
        color = TextSecondary
      )
    }
  }
}

@Composable
fun IslamicCard(
  modifier: Modifier = Modifier,
  backgroundColor: Color = MaloshniyCard,
  borderColor: Color = MaloshniyBorder,
  elevation: Dp = 2.dp,
  onClick: (() -> Unit)? = null,
  content: @Composable ColumnScope.() -> Unit
) {
  Card(
    modifier = modifier
      .fillMaxWidth()
      .then(
        if (onClick != null) Modifier.clickable { onClick() } else Modifier
      ),
    shape = RoundedCornerShape(16.dp),
    colors = CardDefaults.cardColors(containerColor = backgroundColor),
    border = androidx.compose.foundation.BorderStroke(1.dp, borderColor),
    elevation = CardDefaults.cardElevation(defaultElevation = elevation)
  ) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
      content = content
    )
  }
}

@Composable
fun DifficultyBadge(
  difficulty: QuestionDifficulty,
  modifier: Modifier = Modifier
) {
  val (bgColor, textColor) = when (difficulty) {
    QuestionDifficulty.OSON -> Pair(Color(0xFFE8F5E9), Color(0xFF2E7D32))
    QuestionDifficulty.ORTACHA -> Pair(Color(0xFFFFF8E1), Color(0xFFF57F17))
    QuestionDifficulty.QIYIN -> Pair(Color(0xFFFFEBEE), Color(0xFFC62828))
  }

  Surface(
    modifier = modifier,
    shape = RoundedCornerShape(12.dp),
    color = bgColor
  ) {
    Text(
      text = difficulty.label,
      modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp),
      fontSize = 12.sp,
      fontWeight = FontWeight.Medium,
      color = textColor
    )
  }
}

@Composable
fun StatItem(
  title: String,
  value: String,
  subtitle: String? = null,
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(
      text = value,
      fontSize = 20.sp,
      fontWeight = FontWeight.Bold,
      color = IslamicGreenPrimary
    )
    Text(
      text = title,
      fontSize = 12.sp,
      fontWeight = FontWeight.Medium,
      color = TextSecondary
    )
    if (subtitle != null) {
      Text(
        text = subtitle,
        fontSize = 10.sp,
        color = TextLight
      )
    }
  }
}
