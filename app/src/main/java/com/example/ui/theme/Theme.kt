package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val IslamicLightColorScheme = lightColorScheme(
  primary = IslamicGreenPrimary,
  onPrimary = Color.White,
  primaryContainer = IslamicGreenContainer,
  onPrimaryContainer = IslamicGreenText,
  secondary = IslamicGreenSecondary,
  onSecondary = Color.White,
  secondaryContainer = MaloshniySurfaceVariant,
  onSecondaryContainer = IslamicGreenDark,
  tertiary = IslamicGold,
  onTertiary = Color.White,
  tertiaryContainer = IslamicGoldLight,
  onTertiaryContainer = Color(0xFF5A4400),
  background = MaloshniyCream,
  onBackground = TextPrimary,
  surface = MaloshniyCard,
  onSurface = TextPrimary,
  surfaceVariant = MaloshniySurfaceVariant,
  onSurfaceVariant = TextSecondary,
  outline = MaloshniyBorder,
  error = WrongAnswerRed,
  onError = Color.White,
  errorContainer = WrongAnswerContainer,
  onErrorContainer = WrongAnswerRed
)

private val IslamicDarkColorScheme = darkColorScheme(
  primary = IslamicGreenLight,
  onPrimary = IslamicGreenDark,
  primaryContainer = IslamicGreenSecondary,
  onPrimaryContainer = Color.White,
  secondary = IslamicGreenMedium,
  onSecondary = Color.White,
  secondaryContainer = Color(0xFF1E3A2C),
  onSecondaryContainer = Color(0xFFD8F3DC),
  tertiary = IslamicGold,
  onTertiary = Color.Black,
  tertiaryContainer = Color(0xFF4A3B00),
  onTertiaryContainer = IslamicGoldLight,
  background = Color(0xFF0F1E16),
  onBackground = Color(0xFFE8ECE9),
  surface = Color(0xFF172920),
  onSurface = Color(0xFFE8ECE9),
  surfaceVariant = Color(0xFF22362C),
  onSurfaceVariant = Color(0xFFBAC5BE),
  outline = Color(0xFF334B3E)
)

@Composable
fun MyApplicationTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  dynamicColor: Boolean = false,
  content: @Composable () -> Unit
) {
  val colorScheme = if (darkTheme) IslamicDarkColorScheme else IslamicLightColorScheme

  MaterialTheme(
    colorScheme = colorScheme,
    typography = Typography,
    content = content
  )
}
