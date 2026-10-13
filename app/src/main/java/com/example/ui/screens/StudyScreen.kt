package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookOverview
import com.example.data.QuestionsRepository
import com.example.data.UserProgressManager
import com.example.model.Question
import com.example.ui.components.DifficultyBadge
import com.example.ui.components.IslamicCard
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudyScreen(
  onBack: () -> Unit
) {
  BackHandler { onBack() }
  val context = LocalContext.current
  val progressManager = remember { UserProgressManager.getInstance(context) }
  val bookmarkedIds by progressManager.bookmarkedIds.collectAsState()

  var searchQuery by remember { mutableStateOf("") }
  var selectedChapterId by remember { mutableStateOf<String?>(null) }

  val chapters = remember { BookOverview.chapters }

  val filteredQuestions = remember(searchQuery, selectedChapterId) {
    var list = if (searchQuery.isNotBlank()) {
      QuestionsRepository.searchQuestions(searchQuery)
    } else {
      QuestionsRepository.allQuestions
    }
    if (selectedChapterId != null) {
      list = list.filter { it.chapterId == selectedChapterId }
    }
    list
  }

  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Column {
            Text(
              text = "Savollar Qomusi (305 ta)",
              fontSize = 17.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenDark
            )
            Text(
              text = "${filteredQuestions.size} ta savol topildi",
              fontSize = 12.sp,
              color = TextSecondary
            )
          }
        },
        navigationIcon = {
          IconButton(
            onClick = onBack,
            modifier = Modifier.testTag("study_back_button")
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
    ) {
      // Search Bar
      OutlinedTextField(
        value = searchQuery,
        onValueChange = { searchQuery = it },
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = 16.dp, vertical = 6.dp)
          .testTag("study_search_input"),
        placeholder = { Text("Mavzu yoki matn bo'yicha qidirish...") },
        leadingIcon = {
          Icon(Icons.Default.Search, contentDescription = null, tint = IslamicGreenPrimary)
        },
        trailingIcon = {
          if (searchQuery.isNotEmpty()) {
            IconButton(onClick = { searchQuery = "" }) {
              Icon(Icons.Default.Clear, contentDescription = "Tozalash")
            }
          }
        },
        singleLine = true,
        shape = RoundedCornerShape(12.dp),
        colors = OutlinedTextFieldDefaults.colors(
          focusedContainerColor = MaloshniyCard,
          unfocusedContainerColor = MaloshniyCard,
          focusedBorderColor = IslamicGreenPrimary,
          unfocusedBorderColor = MaloshniyBorder
        )
      )

      // Chapter Filter Chips
      LazyRow(
        modifier = Modifier
          .fillMaxWidth()
          .padding(vertical = 4.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
      ) {
        item {
          FilterChip(
            selected = selectedChapterId == null,
            onClick = { selectedChapterId = null },
            label = { Text("Barchasi (305)") },
            colors = FilterChipDefaults.filterChipColors(
              selectedContainerColor = IslamicGreenPrimary,
              selectedLabelColor = MaloshniyCream
            )
          )
        }
        items(chapters) { chapter ->
          FilterChip(
            selected = selectedChapterId == chapter.id,
            onClick = {
              selectedChapterId = if (selectedChapterId == chapter.id) null else chapter.id
            },
            label = { Text(chapter.uzbekTitle) },
            colors = FilterChipDefaults.filterChipColors(
              selectedContainerColor = IslamicGreenPrimary,
              selectedLabelColor = MaloshniyCream
            )
          )
        }
      }

      // Questions List
      LazyColumn(
        modifier = Modifier
          .fillMaxSize()
          .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(vertical = 10.dp)
      ) {
        items(filteredQuestions, key = { it.id }) { question ->
          val isBookmarked = bookmarkedIds.contains(question.id)
          StudyQuestionCard(
            question = question,
            isBookmarked = isBookmarked,
            onToggleBookmark = { progressManager.toggleBookmark(question.id) }
          )
        }
      }
    }
  }
}

@Composable
private fun StudyQuestionCard(
  question: Question,
  isBookmarked: Boolean,
  onToggleBookmark: () -> Unit
) {
  var isExpanded by remember { mutableStateOf(false) }

  IslamicCard(
    backgroundColor = MaloshniyCard,
    borderColor = MaloshniyBorder,
    modifier = Modifier.testTag("study_question_card_${question.id}")
  ) {
    Column {
      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
      ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
          Surface(
            shape = RoundedCornerShape(6.dp),
            color = IslamicGreenContainer,
            modifier = Modifier.padding(end = 8.dp)
          ) {
            Text(
              text = "#${question.id}",
              fontSize = 11.sp,
              fontWeight = FontWeight.Bold,
              color = IslamicGreenDark,
              modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
            )
          }
          DifficultyBadge(difficulty = question.difficulty)
        }

        IconButton(
          onClick = onToggleBookmark,
          modifier = Modifier.size(32.dp)
        ) {
          Icon(
            imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
            contentDescription = "Saqlash",
            tint = if (isBookmarked) IslamicGold else TextLight,
            modifier = Modifier.size(20.dp)
          )
        }
      }

      Spacer(modifier = Modifier.height(6.dp))

      Text(
        text = question.questionText,
        fontSize = 15.sp,
        fontWeight = FontWeight.SemiBold,
        color = TextPrimary
      )

      Spacer(modifier = Modifier.height(8.dp))

      // Correct Answer highlight
      val correctAnswer = question.options.getOrNull(question.correctIndex) ?: ""
      Surface(
        shape = RoundedCornerShape(8.dp),
        color = CorrectAnswerContainer,
        modifier = Modifier.fillMaxWidth()
      ) {
        Row(
          modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
          verticalAlignment = Alignment.CenterVertically
        ) {
          Text(
            text = "To'g'ri javob: ",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = CorrectAnswerGreen
          )
          Text(
            text = correctAnswer,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium,
            color = CorrectAnswerGreen
          )
        }
      }

      // Expand / Collapse Sharh
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .clickable { isExpanded = !isExpanded }
          .padding(top = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
      ) {
        Text(
          text = if (isExpanded) "Sharhni yashirish" else "Fiqhiy sharhni ko'rish",
          fontSize = 12.sp,
          fontWeight = FontWeight.SemiBold,
          color = IslamicGreenSecondary
        )
        Icon(
          imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
          contentDescription = null,
          tint = IslamicGreenSecondary,
          modifier = Modifier.size(20.dp)
        )
      }

      AnimatedVisibility(visible = isExpanded) {
        Column(
          modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
            .background(MaloshniySurfaceVariant, RoundedCornerShape(8.dp))
            .padding(10.dp)
        ) {
          Text(
            text = question.explanation,
            fontSize = 13.sp,
            lineHeight = 19.sp,
            color = TextPrimary
          )
          Spacer(modifier = Modifier.height(6.dp))
          Text(
            text = "Manba: ${question.bookReference}",
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
            color = IslamicGold
          )
        }
      }
    }
  }
}
