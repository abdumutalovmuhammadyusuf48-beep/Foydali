package com.example

import com.example.data.BookOverview
import com.example.data.QuestionsRepository
import com.example.model.QuizResult
import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {

  @Test
  fun testQuestionsRepositoryTotalCount() {
    val total = QuestionsRepository.allQuestions.size
    assertTrue("Kamida 300 ta savol bo'lishi kerak, lekin topildi: $total", total >= 300)
    assertEquals(305, total)
  }

  @Test
  fun testAllQuestionsIntegrity() {
    val questions = QuestionsRepository.allQuestions
    for (q in questions) {
      assertTrue("Savol #${q.id} matni bo'sh bo'lmasligi kerak", q.questionText.isNotBlank())
      assertEquals("Savol #${q.id} 4 ta variantga ega bo'lishi kerak", 4, q.options.size)
      assertTrue("Savol #${q.id} to'g'ri javob indeksi 0..3 oralig'ida bo'lishi kerak", q.correctIndex in 0..3)
      assertTrue("Savol #${q.id} fiqhiy sharhga ega bo'lishi kerak", q.explanation.isNotBlank())
      assertTrue("Savol #${q.id} manbaga ega bo'lishi kerak", q.bookReference.isNotBlank())
      assertTrue("Savol #${q.id} kitob bo'limiga ega bo'lishi kerak", q.chapterId.isNotBlank())
    }
  }

  @Test
  fun testSearchQuestions() {
    val tahoratResults = QuestionsRepository.searchQuestions("tahorat")
    assertTrue(tahoratResults.isNotEmpty())

    val mashResults = QuestionsRepository.searchQuestions("mash tortish")
    assertTrue(mashResults.isNotEmpty())
  }

  @Test
  fun testChaptersCoverage() {
    val chapters = QuestionsRepository.getChapters()
    assertEquals(13, chapters.size)
    for (ch in chapters) {
      val chapterQuestions = QuestionsRepository.getQuestionsByChapter(ch.id)
      assertTrue("Bob ${ch.id} da savollar mavjud bo'lishi kerak", chapterQuestions.isNotEmpty())
    }
  }

  @Test
  fun testQuizResultRankCalculation() {
    val resultFaqih = QuizResult(totalQuestions = 20, correctAnswers = 19, wrongAnswers = 1, timeSpentSeconds = 120, chapterTitle = "Tahorat")
    assertEquals(95, resultFaqih.percentage)
    assertTrue(resultFaqih.rankTitle.contains("Faqih"))

    val resultMutafaqqih = QuizResult(totalQuestions = 20, correctAnswers = 16, wrongAnswers = 4, timeSpentSeconds = 120, chapterTitle = "Tahorat")
    assertEquals(80, resultMutafaqqih.percentage)
    assertTrue(resultMutafaqqih.rankTitle.contains("Mutafaqqih"))

    val resultMubtadiy = QuizResult(totalQuestions = 20, correctAnswers = 6, wrongAnswers = 14, timeSpentSeconds = 120, chapterTitle = "Tahorat")
    assertEquals(30, resultMubtadiy.percentage)
    assertTrue(resultMubtadiy.rankTitle.contains("Mubtadiy"))
  }
}
