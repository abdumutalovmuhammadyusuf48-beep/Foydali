package com.example.data

import com.example.model.Chapter
import com.example.model.Question
import com.example.model.QuestionDifficulty

object QuestionsRepository {

  val allQuestions: List<Question> by lazy {
    (questionsPart1 + questionsPart2 + questionsPart3 + questionsPart4 + questionsPart5)
      .distinctBy { it.id }
      .sortedBy { it.id }
  }

  fun getQuestionsByChapter(chapterId: String): List<Question> {
    return allQuestions.filter { it.chapterId == chapterId }
  }

  fun getQuestionById(id: Int): Question? {
    return allQuestions.find { it.id == id }
  }

  fun getQuestionsByIds(ids: Collection<Int>): List<Question> {
    val idSet = ids.toSet()
    return allQuestions.filter { it.id in idSet }
  }

  fun getRandomQuiz(count: Int = 15, chapterId: String? = null): List<Question> {
    val pool = if (chapterId != null) {
      getQuestionsByChapter(chapterId)
    } else {
      allQuestions
    }
    return pool.shuffled().take(count)
  }

  fun searchQuestions(query: String): List<Question> {
    if (query.isBlank()) return allQuestions
    val q = query.trim().lowercase()
    return allQuestions.filter {
      it.questionText.lowercase().contains(q) ||
        it.chapterTitle.lowercase().contains(q) ||
        it.explanation.lowercase().contains(q) ||
        it.bookReference.lowercase().contains(q) ||
        it.options.any { opt -> opt.lowercase().contains(q) }
    }
  }

  fun getChapters(): List<Chapter> {
    return BookOverview.chapters.map { chapter ->
      val count = allQuestions.count { it.chapterId == chapter.id }
      chapter.copy(questionCount = if (count > 0) count else chapter.questionCount)
    }
  }
}
