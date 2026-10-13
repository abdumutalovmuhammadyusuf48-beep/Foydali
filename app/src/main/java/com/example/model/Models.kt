package com.example.model

enum class QuestionDifficulty(val label: String) {
  OSON("Oson"),
  ORTACHA("O'rtacha"),
  QIYIN("Chuqur fiqh")
}

data class Question(
  val id: Int,
  val chapterId: String,
  val chapterTitle: String,
  val questionText: String,
  val options: List<String>,
  val correctIndex: Int,
  val explanation: String,
  val bookReference: String,
  val difficulty: QuestionDifficulty = QuestionDifficulty.ORTACHA
)

data class Chapter(
  val id: String,
  val arabicTitle: String,
  val uzbekTitle: String,
  val description: String,
  val questionCount: Int
)

data class QuizResult(
  val totalQuestions: Int,
  val correctAnswers: Int,
  val wrongAnswers: Int,
  val timeSpentSeconds: Long,
  val chapterTitle: String
) {
  val percentage: Int
    get() = if (totalQuestions > 0) (correctAnswers * 100 / totalQuestions) else 0

  val rankTitle: String
    get() = when {
      percentage >= 90 -> "Faqih darajasi (Mumtoz)"
      percentage >= 75 -> "Mutafaqqih tolib (A'lo)"
      percentage >= 50 -> "Tolibi ilm (Yaxshi)"
      else -> "Mubtadiy (Qayta takrorlash tavsiya etiladi)"
    }
}
