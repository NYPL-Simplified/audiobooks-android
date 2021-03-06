package org.librarysimplified.audiobook.tests.device

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import org.junit.runner.RunWith
import org.librarysimplified.audiobook.tests.PlayerManifestContract
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@RunWith(AndroidJUnit4::class)
@MediumTest
class PlayerManifestTest : PlayerManifestContract() {
  override fun log(): Logger {
    return LoggerFactory.getLogger(PlayerManifestTest::class.java)
  }
}
