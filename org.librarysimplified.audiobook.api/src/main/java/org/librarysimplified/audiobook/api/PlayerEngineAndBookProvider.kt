package org.librarysimplified.audiobook.api

/**
 * A book provider and the engine that produced it.
 */

data class PlayerEngineAndBookProvider(
  val engineProvider: PlayerAudioEngineProviderType,
  val bookProvider: PlayerAudioBookProviderType
)
