package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.QuestionsRepository
import com.example.model.Chapter
import com.example.ui.components.IslamicCard
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChapterListScreen(
  onBack: () -> Unit,
  onSelectChapter: (Chapter) -> Unit
) {
  BackHandler { onBack() }
  val chapters = QuestionsRepository.getChapters()

  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Column {
            Text(
              text = "Boblari bo'yicha testlar",
              fontSize = 18.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenDark
            )
            Text(
              text = "Muxtasarul Viqoyaning 13 ta asosiy kitobi",
              fontSize = 12.sp,
              color = TextSecondary
            )
          }
        },
        navigationIcon = {
          IconButton(
            onClick = onBack,
            modifier = Modifier.testTag("chapter_list_back_button")
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
    LazyColumn(
      modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)
        .padding(horizontal = 16.dp),
      verticalArrangement = Arrangement.spacedBy(10.dp),
      contentPadding = PaddingValues(vertical = 12.dp)
    ) {
      items(chapters) { chapter ->
        ChapterItem(
          chapter = chapter,
          onClick = { onSelectChapter(chapter) }
        )
      }
    }
  }
}

@Composable
private fun ChapterItem(
  chapter: Chapter,
  onClick: () -> Unit
) {
  IslamicCard(
    backgroundColor = MaloshniyCard,
    borderColor = MaloshniyBorder,
    onClick = onClick,
    modifier = Modifier.testTag("chapter_item_${chapter.id}")
  ) {
    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically
    ) {
      Column(modifier = Modifier.weight(1f)) {
        Text(
          text = chapter.arabicTitle,
          fontSize = 17.sp,
          fontWeight = FontWeight.Bold,
          color = IslamicGreenPrimary
        )
        Text(
          text = chapter.uzbekTitle,
          fontSize = 15.sp,
          fontWeight = FontWeight.SemiBold,
          color = TextPrimary
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
          text = chapter.description,
          fontSize = 12.sp,
          color = TextSecondary,
          maxLines = 2
        )
        Spacer(modifier = Modifier.height(6.dp))
        Surface(
          shape = RoundedCornerShape(8.dp),
          color = IslamicGreenContainer
        ) {
          Text(
            text = "${chapter.questionCount} ta savol",
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
            color = IslamicGreenText,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
          )
        }
      }

      IconButton(
        onClick = onClick,
        modifier = Modifier.testTag("start_chapter_test_${chapter.id}")
      ) {
        Icon(
          imageVector = Icons.Default.PlayArrow,
          contentDescription = "Boshlash",
          tint = IslamicGreenSecondary
        )
      }
    }
  }
}
