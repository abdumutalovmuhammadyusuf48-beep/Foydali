package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.UserProgressManager
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("Muxtasarul Viqoya", appName)
  }

  @Test
  fun `test UserProgressManager bookmarks and timer defaults`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val progressManager = UserProgressManager(context)

    assertEquals(30, progressManager.timerDurationSec.value)
    assertTrue(progressManager.isTimerEnabled.value)

    progressManager.toggleBookmark(1)
    assertTrue(progressManager.isBookmarked(1))

    progressManager.toggleBookmark(1)
    org.junit.Assert.assertFalse(progressManager.isBookmarked(1))
  }
}
