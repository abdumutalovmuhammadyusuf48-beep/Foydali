package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.data.QuestionsRepository
import com.example.model.Chapter
import com.example.model.Question
import com.example.model.QuizResult
import com.example.ui.screens.*
import com.example.ui.theme.MaloshniyCream
import com.example.ui.theme.MyApplicationTheme

sealed interface Screen {
  object Home : Screen
  object BookInfo : Screen
  object ChapterList : Screen
  data class Quiz(val questions: List<Question>, val title: String) : Screen
  data class Result(val result: QuizResult, val previousQuestions: List<Question>, val title: String) : Screen
  object Study : Screen
  object Mistakes : Screen
  object Bookmarks : Screen
}

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      MyApplicationTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaloshniyCream
        ) {
          MuxtasarulViqoyaApp()
        }
      }
    }
  }
}

@Composable
fun MuxtasarulViqoyaApp() {
  var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }

  Crossfade(targetState = currentScreen, label = "ScreenTransition") { screen ->
    when (screen) {
      is Screen.Home -> {
        HomeScreen(
          onStartQuickQuiz = {
            val questions = QuestionsRepository.getRandomQuiz(15)
            currentScreen = Screen.Quiz(questions, "Tezkor Fiqhiy Sinov (15 savol)")
          },
          onOpenChapters = {
            currentScreen = Screen.ChapterList
          },
          onOpenBookInfo = {
            currentScreen = Screen.BookInfo
          },
          onOpenStudy = {
            currentScreen = Screen.Study
          },
          onOpenMistakes = {
            currentScreen = Screen.Mistakes
          },
          onOpenBookmarks = {
            currentScreen = Screen.Bookmarks
          }
        )
      }

      is Screen.BookInfo -> {
        BookInfoScreen(
          onBack = { currentScreen = Screen.Home },
          onStartQuiz = {
            val questions = QuestionsRepository.getRandomQuiz(15)
            currentScreen = Screen.Quiz(questions, "Muxtasarul Viqoya Sinov Testi")
          }
        )
      }

      is Screen.ChapterList -> {
        ChapterListScreen(
          onBack = { currentScreen = Screen.Home },
          onSelectChapter = { chapter: Chapter ->
            val questions = QuestionsRepository.getQuestionsByChapter(chapter.id)
            currentScreen = Screen.Quiz(questions, chapter.uzbekTitle)
          }
        )
      }

      is Screen.Quiz -> {
        QuizScreen(
          questions = screen.questions,
          title = screen.title,
          onBack = { currentScreen = Screen.Home },
          onFinishQuiz = { result ->
            currentScreen = Screen.Result(result, screen.questions, screen.title)
          }
        )
      }

      is Screen.Result -> {
        QuizResultScreen(
          result = screen.result,
          onRetake = {
            currentScreen = Screen.Quiz(screen.previousQuestions, screen.title)
          },
          onReviewMistakes = {
            currentScreen = Screen.Mistakes
          },
          onGoHome = {
            currentScreen = Screen.Home
          }
        )
      }

      is Screen.Study -> {
        StudyScreen(
          onBack = { currentScreen = Screen.Home }
        )
      }

      is Screen.Mistakes -> {
        MistakesScreen(
          onBack = { currentScreen = Screen.Home },
          onStartQuiz = { questions ->
            currentScreen = Screen.Quiz(questions, "Xatolar Ustida Ishlash")
          }
        )
      }

      is Screen.Bookmarks -> {
        BookmarksScreen(
          onBack = { currentScreen = Screen.Home },
          onStartQuiz = { questions ->
            currentScreen = Screen.Quiz(questions, "Saqlangan Savollar Testi")
          }
        )
      }
    }
  }
}
