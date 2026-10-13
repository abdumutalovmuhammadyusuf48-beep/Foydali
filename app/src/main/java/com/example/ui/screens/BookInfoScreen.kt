package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookOverview
import com.example.ui.components.BismillahHeader
import com.example.ui.components.IslamicCard
import com.example.ui.components.IslamicOrnamentDivider
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookInfoScreen(
  onBack: () -> Unit,
  onStartQuiz: () -> Unit
) {
  BackHandler { onBack() }
  val scrollState = rememberScrollState()

  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Text(
            text = "Kitob haqida",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = IslamicGreenDark
          )
        },
        navigationIcon = {
          IconButton(
            onClick = onBack,
            modifier = Modifier.testTag("book_info_back_button")
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
    containerColor = MaloshniyCream
  ) { paddingValues ->
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)
        .verticalScroll(scrollState)
        .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
      BismillahHeader()

      Spacer(modifier = Modifier.height(8.dp))

      // Book Title Card
      IslamicCard(
        backgroundColor = MaloshniyCard,
        borderColor = IslamicGoldBorder
      ) {
        Text(
          text = BookOverview.BOOK_NAME_ARABIC,
          fontSize = 24.sp,
          fontWeight = FontWeight.Bold,
          color = IslamicGreenPrimary,
          textAlign = TextAlign.Center,
          modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
          text = BookOverview.BOOK_NAME_UZBEK,
          fontSize = 17.sp,
          fontWeight = FontWeight.SemiBold,
          color = TextPrimary,
          textAlign = TextAlign.Center,
          modifier = Modifier.fillMaxWidth()
        )
        Text(
          text = "Muallif: " + BookOverview.AUTHOR_FULL,
          fontSize = 13.sp,
          color = TextSecondary,
          textAlign = TextAlign.Center,
          modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
        )
        Text(
          text = "Vafoti: " + BookOverview.AUTHOR_DEATH + " | " + BookOverview.MADHHAB,
          fontSize = 12.sp,
          color = IslamicGold,
          textAlign = TextAlign.Center,
          modifier = Modifier.fillMaxWidth()
        )
      }

      IslamicOrnamentDivider()

      // Section 1: Asarning mohiyati va tarixi
      InfoSection(
        icon = Icons.Default.MenuBook,
        title = "Asarning Kelib Chiqish Tarixi",
        body = """
Burhoniddin Marg'inoniy (r.a.) o'zining shoh asari «Al-Hidoya»ni yozgach, u butun Hanafiy dunyosida e'tirof etildi.

Sadrush Shari'aning bobosi Mahmud Tojush Shari'a o'z nabirasi Ubaydulloh yoshligida «Hidoya»dagi nozik fiqhiy masalalarni oson yod olishi uchun «Viqoyatur rivoya fi masoilih Hidoya» asarini yozgan.

Keyinchalik nabira — alloma Sadrush Shari'a Ubaydulloh ibn Mas'ud (r.a.) ushbu asarni yanada sayqallab, eng kerakli va zaruriy matnlarni saralab, ixchamlashtirdi va unga «Muxtasarul Viqoya» deb nom berdi. Shuningdek unga o'zi mashhur «Sharhul Viqoya» sharhini ham bitdi.
        """.trimIndent()
      )

      Spacer(modifier = Modifier.height(12.dp))

      // Section 2: Movarounnahr Madrasalarida o'rni
      InfoSection(
        icon = Icons.Default.School,
        title = "Madrasalar Dasturidagi Mo'tabar O'rni",
        body = """
«Muxtasarul Viqoya» asari asrlar mobaynida Buxoro, Samarqand, Xiva, Qo'qon, Toshkent va butun Movarounnahr hamda Mavlono va Hindiston madrasalarida fiqh ilmining ikkinchi va uchinchi bosqich talabalari uchun asosiy darslik bo'lib xizmat qilgan.

Toliblar «Avvali ilm» va «Fiqhi Kaydoniy»dan so'ng aynan «Muxtasarul Viqoya»ni to'liq matnini yod olganlar va qiroat qilganlar.
        """.trimIndent()
      )

      Spacer(modifier = Modifier.height(12.dp))

      // Section 3: Asar tuzilishi
      InfoSection(
        icon = Icons.Default.AutoStories,
        title = "Asar Qamrovi va Boblari",
        body = """
Asar 13 dan ortiq bosh kitob va yuzlab fasllardan iborat:
• Tahorat kitobi (suvlar, tahorat, g'usl, hayz, najosatlar)
• Namoz kitobi (vaqtlar, imomat, juma, hayit, janoza, safar, bemor)
• Zakot kitobi (chorva, tilla-kumush, ushur, fitr)
• Ro'za kitobi (qazo, kafforat, e'tikof)
• Haj kitobi (miqotlar, ehrom, tavof, jinoyatlar)
• Nikoh, Rizo' (emizish) va Taloq kitoblari
• Qasamlar va Nazrlar
• Savdo-sotiq (Bay'), Sudxo'rlik (Ribo) va Sherikchilik
• Muomalot (Ijara, Vaqf, Rahn, Kafolat, Hadya, Shuf'a)
• Jinoyatlar, Qasos, Diyat, Qozilik va Guvohliklar
        """.trimIndent()
      )

      Spacer(modifier = Modifier.height(12.dp))

      // Section 4: Ushbu Ilovaning maqsadi
      InfoSection(
        icon = Icons.Default.Lightbulb,
        title = "Ilovadagi 305+ Test Savollari Haqida",
        body = """
Mazkur dasturda «Muxtasarul Viqoya»ning asl matni va uning mo'tabar sharhlariga qat'iy tayangan holda 305 dan ortiq batafsil test savollari tuzilgan.

Har bir savolda:
✓ To'liq fiqhiy savol va 4 ta variant
✓ 30 soniyalik teskari hisoblagich (timer)
✓ Har bir to'g'ri javobga kitobdan asos va sharh (izoh)
✓ Manbasi va kitobdagi bobi keltirilgan.
        """.trimIndent()
      )

      Spacer(modifier = Modifier.height(20.dp))

      Button(
        onClick = onStartQuiz,
        modifier = Modifier
          .fillMaxWidth()
          .height(52.dp)
          .testTag("start_quiz_from_info_button"),
        shape = RoundedCornerShape(14.dp),
        colors = ButtonDefaults.buttonColors(containerColor = IslamicGreenPrimary)
      ) {
        Icon(Icons.Default.Bookmark, contentDescription = null, tint = MaloshniyCream)
        Spacer(modifier = Modifier.width(8.dp))
        Text(
          text = "Sinov Testlarini Boshlash",
          fontSize = 16.sp,
          fontWeight = FontWeight.Bold,
          color = MaloshniyCream
        )
      }

      Spacer(modifier = Modifier.height(24.dp))
    }
  }
}

@Composable
private fun InfoSection(
  icon: ImageVector,
  title: String,
  body: String
) {
  IslamicCard(
    backgroundColor = MaloshniyCard,
    borderColor = MaloshniyBorder
  ) {
    Row(verticalAlignment = Alignment.CenterVertically) {
      Surface(
        shape = RoundedCornerShape(8.dp),
        color = IslamicGreenContainer,
        modifier = Modifier.size(36.dp)
      ) {
        Box(contentAlignment = Alignment.Center) {
          Icon(
            imageVector = icon,
            contentDescription = null,
            tint = IslamicGreenPrimary,
            modifier = Modifier.size(20.dp)
          )
        }
      }
      Spacer(modifier = Modifier.width(12.dp))
      Text(
        text = title,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = IslamicGreenDark
      )
    }
    Spacer(modifier = Modifier.height(10.dp))
    Text(
      text = body,
      fontSize = 14.sp,
      lineHeight = 21.sp,
      color = TextPrimary
    )
  }
}
