package com.example.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.BookOverview
import com.example.data.QuestionsRepository
import com.example.data.UserProgressManager
import com.example.ui.components.BismillahHeader
import com.example.ui.components.IslamicCard
import com.example.ui.components.IslamicOrnamentDivider
import com.example.ui.components.StatItem
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
  onStartQuickQuiz: () -> Unit,
  onOpenChapters: () -> Unit,
  onOpenBookInfo: () -> Unit,
  onOpenStudy: () -> Unit,
  onOpenMistakes: () -> Unit,
  onOpenBookmarks: () -> Unit
) {
  val context = LocalContext.current
  val progressManager = remember { UserProgressManager.getInstance(context) }
  val solvedCount by progressManager.solvedCount.collectAsState()
  val totalCorrect by progressManager.totalCorrect.collectAsState()
  val mistakeIds by progressManager.mistakeIds.collectAsState()
  val bookmarkedIds by progressManager.bookmarkedIds.collectAsState()

  val accuracy = if (solvedCount > 0) (totalCorrect * 100 / solvedCount) else 0

  val scrollState = rememberScrollState()

  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Column {
            Text(
              text = "Muxtasarul Viqoya",
              fontSize = 18.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenDark
            )
            Text(
              text = "مختصر الوقاية في مسائل الهداية",
              fontSize = 12.sp,
              color = IslamicGold
            )
          }
        },
        actions = {
          IconButton(
            onClick = onOpenBookInfo,
            modifier = Modifier.testTag("home_info_button")
          ) {
            Icon(
              imageVector = Icons.Default.Info,
              contentDescription = "Kitob haqida",
              tint = IslamicGreenPrimary
            )
          }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaloshniyCream)
      )
    },
    containerColor = MaloshniyCream
  ) { paddingValues ->
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)
        .verticalScroll(scrollState)
        .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
      BismillahHeader()

      Spacer(modifier = Modifier.height(6.dp))

      // Hero Banner with Image and Arabic calligraphy frame
      Card(
        modifier = Modifier
          .fillMaxWidth()
          .height(150.dp)
          .testTag("home_hero_banner"),
        shape = RoundedCornerShape(16.dp),
        border = androidx.compose.foundation.BorderStroke(1.dp, IslamicGoldBorder),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
      ) {
        Box(modifier = Modifier.fillMaxSize()) {
          Image(
            painter = painterResource(id = R.drawable.banner_islamic_art),
            contentDescription = "Muxtasarul Viqoya san'ati",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
          )

          // Subtle gradient overlay for contrast
          Box(
            modifier = Modifier
              .fillMaxSize()
              .background(IslamicGreenDark.copy(alpha = 0.65f))
          )

          Column(
            modifier = Modifier
              .fillMaxSize()
              .padding(16.dp),
            verticalArrangement = Arrangement.Center
          ) {
            Text(
              text = "مختصر الوقاية",
              fontSize = 24.sp,
              fontWeight = FontWeight.Bold,
              color = MaloshniyCream
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
              text = "Hanafiy fiqhining 305+ ta asosli va batafsil testlari",
              fontSize = 13.sp,
              color = MaloshniySurfaceVariant,
              lineHeight = 18.sp
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
              Icon(
                imageVector = Icons.Default.Timer,
                contentDescription = null,
                tint = IslamicGold,
                modifier = Modifier.size(14.dp)
              )
              Spacer(modifier = Modifier.width(4.dp))
              Text(
                text = "Har bir savolga 30 soniya hisoblagich",
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                color = IslamicGold
              )
            }
          }
        }
      }

      Spacer(modifier = Modifier.height(14.dp))

      // Quick Quiz CTA Button (Primary Action)
      Button(
        onClick = onStartQuickQuiz,
        modifier = Modifier
          .fillMaxWidth()
          .height(56.dp)
          .testTag("start_quick_quiz_button"),
        shape = RoundedCornerShape(14.dp),
        colors = ButtonDefaults.buttonColors(containerColor = IslamicGreenPrimary),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 3.dp)
      ) {
        Icon(
          imageVector = Icons.Default.PlayArrow,
          contentDescription = null,
          tint = MaloshniyCream,
          modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
          Text(
            text = "Tezkor Fiqhiy Sinov (15 savol)",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = MaloshniyCream
          )
          Text(
            text = "Barcha boblardan tasodifiy • 30 soniya/savol",
            fontSize = 11.sp,
            color = MaloshniySurfaceVariant
          )
        }
      }

      Spacer(modifier = Modifier.height(14.dp))

      // User Stats Card
      IslamicCard(
        backgroundColor = MaloshniyCard,
        borderColor = MaloshniyBorder
      ) {
        Text(
          text = "Sizning O'zlashtirish Ko'rsatkichingiz",
          fontSize = 14.sp,
          fontWeight = FontWeight.Bold,
          color = IslamicGreenDark
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
          modifier = Modifier.fillMaxWidth(),
          horizontalArrangement = Arrangement.SpaceAround
        ) {
          StatItem(title = "Yechilgan", value = "$solvedCount")
          StatItem(title = "Aniqlik", value = "$accuracy%")
          StatItem(title = "Xatolar", value = "${mistakeIds.size}")
          StatItem(title = "Saqlangan", value = "${bookmarkedIds.size}")
        }
      }

      IslamicOrnamentDivider()

      Text(
        text = "Bo'limlar va O'quv Rejalari",
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        color = IslamicGreenDark,
        modifier = Modifier.padding(vertical = 4.dp)
      )

      // Navigation Grid Cards
      HomeMenuCard(
        icon = Icons.Default.MenuBook,
        title = "Boblari bo'yicha testlar",
        subtitle = "Tahorat, Namoz, Zakot, Ro'za, Haj, Nikoh va boshqa 13 ta kitob",
        badge = "13 bob",
        onClick = onOpenChapters,
        testTag = "menu_chapters"
      )

      Spacer(modifier = Modifier.height(8.dp))

      HomeMenuCard(
        icon = Icons.Default.Search,
        title = "Barcha savollar qomusi (305 ta)",
        subtitle = "Kitobdagi barcha savollarni qidirish, o'rganish va fiqhiy sharhlari",
        badge = "305 savol",
        onClick = onOpenStudy,
        testTag = "menu_study"
      )

      Spacer(modifier = Modifier.height(8.dp))

      HomeMenuCard(
        icon = Icons.Default.Error,
        title = "Xatolar ustida ishlash",
        subtitle = "Noto'g'ri belgilangan yoki vaqti tugagan savollarni qayta topshirish",
        badge = "${mistakeIds.size} ta xato",
        onClick = onOpenMistakes,
        testTag = "menu_mistakes"
      )

      Spacer(modifier = Modifier.height(8.dp))

      HomeMenuCard(
        icon = Icons.Default.Bookmark,
        title = "Saqlangan savollar",
        subtitle = "Qayta takrorlash uchun belgilab qo'yilgan nozik masalalar",
        badge = "${bookmarkedIds.size} ta",
        onClick = onOpenBookmarks,
        testTag = "menu_bookmarks"
      )

      Spacer(modifier = Modifier.height(8.dp))

      HomeMenuCard(
        icon = Icons.Default.AutoStories,
        title = "«Muxtasarul Viqoya» haqida",
        subtitle = "Asarning kelib chiqish tarixi, muallifi va madrasalardagi o'rni",
        badge = "Tarix",
        onClick = onOpenBookInfo,
        testTag = "menu_book_info"
      )

      Spacer(modifier = Modifier.height(14.dp))

      // Hikmat / Scholarly Quote Card
      IslamicCard(
        backgroundColor = MaloshniySurfaceVariant,
        borderColor = IslamicGoldBorder
      ) {
        Row(verticalAlignment = Alignment.Top) {
          Icon(
            imageVector = Icons.Default.FormatQuote,
            contentDescription = null,
            tint = IslamicGold,
            modifier = Modifier.size(24.dp)
          )
          Spacer(modifier = Modifier.width(8.dp))
          Column {
            Text(
              text = "Fiqhiy Masala (Muxtasarul Viqoya):",
              fontSize = 12.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenDark
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
              text = "«Tahoratda boshning to'rtdan bir qismiga mash tortish farzdir. Quyilgan suv va ko'p suv najosat tushsa ham, rangi, ta'mi yoki hidi o'zgarmasa pok hisoblanadi.»",
              fontSize = 13.sp,
              lineHeight = 18.sp,
              color = TextPrimary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
              text = "— «Kitobut Tahorat», Muxtasarul Viqoya",
              fontSize = 11.sp,
              fontWeight = FontWeight.Medium,
              color = IslamicGreenSecondary
            )
          }
        }
      }

      Spacer(modifier = Modifier.height(24.dp))
    }
  }
}

@Composable
private fun HomeMenuCard(
  icon: ImageVector,
  title: String,
  subtitle: String,
  badge: String,
  onClick: () -> Unit,
  testTag: String
) {
  IslamicCard(
    backgroundColor = MaloshniyCard,
    borderColor = MaloshniyBorder,
    onClick = onClick,
    modifier = Modifier.testTag(testTag)
  ) {
    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically
    ) {
      Surface(
        shape = RoundedCornerShape(10.dp),
        color = IslamicGreenContainer,
        modifier = Modifier.size(40.dp)
      ) {
        Box(contentAlignment = Alignment.Center) {
          Icon(
            imageVector = icon,
            contentDescription = null,
            tint = IslamicGreenPrimary,
            modifier = Modifier.size(22.dp)
          )
        }
      }

      Spacer(modifier = Modifier.width(12.dp))

      Column(modifier = Modifier.weight(1f)) {
        Row(
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.SpaceBetween,
          modifier = Modifier.fillMaxWidth()
        ) {
          Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = TextPrimary
          )
          Surface(
            shape = RoundedCornerShape(6.dp),
            color = MaloshniySurfaceVariant
          ) {
            Text(
              text = badge,
              fontSize = 10.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenSecondary,
              modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
            )
          }
        }
        Spacer(modifier = Modifier.height(2.dp))
        Text(
          text = subtitle,
          fontSize = 11.sp,
          color = TextSecondary,
          lineHeight = 16.sp
        )
      }
    }
  }
}
