package com.example.data

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class UserProgressManager(context: Context) {
  private val prefs: SharedPreferences =
    context.getSharedPreferences("muxtasarul_viqoya_prefs", Context.MODE_PRIVATE)

  private val _bookmarkedIds = MutableStateFlow<Set<Int>>(emptySet())
  val bookmarkedIds: StateFlow<Set<Int>> = _bookmarkedIds.asStateFlow()

  private val _mistakeIds = MutableStateFlow<Set<Int>>(emptySet())
  val mistakeIds: StateFlow<Set<Int>> = _mistakeIds.asStateFlow()

  private val _solvedCount = MutableStateFlow(0)
  val solvedCount: StateFlow<Int> = _solvedCount.asStateFlow()

  private val _totalCorrect = MutableStateFlow(0)
  val totalCorrect: StateFlow<Int> = _totalCorrect.asStateFlow()

  private val _timerDurationSec = MutableStateFlow(30)
  val timerDurationSec: StateFlow<Int> = _timerDurationSec.asStateFlow()

  private val _isTimerEnabled = MutableStateFlow(true)
  val isTimerEnabled: StateFlow<Boolean> = _isTimerEnabled.asStateFlow()

  init {
    loadData()
  }

  private fun loadData() {
    val bSet = prefs.getStringSet(KEY_BOOKMARKS, emptySet()) ?: emptySet()
    _bookmarkedIds.value = bSet.mapNotNull { it.toIntOrNull() }.toSet()

    val mSet = prefs.getStringSet(KEY_MISTAKES, emptySet()) ?: emptySet()
    _mistakeIds.value = mSet.mapNotNull { it.toIntOrNull() }.toSet()

    _solvedCount.value = prefs.getInt(KEY_SOLVED_COUNT, 0)
    _totalCorrect.value = prefs.getInt(KEY_TOTAL_CORRECT, 0)
    _timerDurationSec.value = prefs.getInt(KEY_TIMER_DURATION, 30)
    _isTimerEnabled.value = prefs.getBoolean(KEY_TIMER_ENABLED, true)
  }

  fun toggleBookmark(questionId: Int) {
    val current = _bookmarkedIds.value.toMutableSet()
    if (current.contains(questionId)) {
      current.remove(questionId)
    } else {
      current.add(questionId)
    }
    _bookmarkedIds.value = current
    prefs.edit().putStringSet(KEY_BOOKMARKS, current.map { it.toString() }.toSet()).apply()
  }

  fun isBookmarked(questionId: Int): Boolean {
    return _bookmarkedIds.value.contains(questionId)
  }

  fun recordMistake(questionId: Int) {
    val current = _mistakeIds.value.toMutableSet()
    current.add(questionId)
    _mistakeIds.value = current
    prefs.edit().putStringSet(KEY_MISTAKES, current.map { it.toString() }.toSet()).apply()
  }

  fun removeMistake(questionId: Int) {
    val current = _mistakeIds.value.toMutableSet()
    current.remove(questionId)
    _mistakeIds.value = current
    prefs.edit().putStringSet(KEY_MISTAKES, current.map { it.toString() }.toSet()).apply()
  }

  fun clearAllMistakes() {
    _mistakeIds.value = emptySet()
    prefs.edit().remove(KEY_MISTAKES).apply()
  }

  fun recordQuizCompletion(correct: Int, total: Int) {
    val newSolved = _solvedCount.value + total
    val newCorrect = _totalCorrect.value + correct
    _solvedCount.value = newSolved
    _totalCorrect.value = newCorrect

    prefs.edit()
      .putInt(KEY_SOLVED_COUNT, newSolved)
      .putInt(KEY_TOTAL_CORRECT, newCorrect)
      .apply()
  }

  fun setTimerEnabled(enabled: Boolean) {
    _isTimerEnabled.value = enabled
    prefs.edit().putBoolean(KEY_TIMER_ENABLED, enabled).apply()
  }

  fun setTimerDuration(seconds: Int) {
    _timerDurationSec.value = seconds
    prefs.edit().putInt(KEY_TIMER_DURATION, seconds).apply()
  }

  companion object {
    private const val KEY_BOOKMARKS = "bookmarks"
    private const val KEY_MISTAKES = "mistakes"
    private const val KEY_SOLVED_COUNT = "solved_count"
    private const val KEY_TOTAL_CORRECT = "total_correct"
    private const val KEY_TIMER_DURATION = "timer_duration"
    private const val KEY_TIMER_ENABLED = "timer_enabled"

    @Volatile
    private var instance: UserProgressManager? = null

    fun getInstance(context: Context): UserProgressManager {
      return instance ?: synchronized(this) {
        instance ?: UserProgressManager(context.applicationContext).also { instance = it }
      }
    }
  }
}
