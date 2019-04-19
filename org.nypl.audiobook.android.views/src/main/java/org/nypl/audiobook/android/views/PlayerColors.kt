package org.nypl.audiobook.android.views

import android.content.Context
import android.content.res.Resources
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.util.TypedValue

/**
 * Functions to resolve colors from themes.
 *
 * @since 2.0.0
 */

internal object PlayerColors {

  /**
   * Resolve the given attribute color value against the given theme.
   */

  @JvmStatic
  @ColorInt
  fun resolveColorAttribute(
    theme: Resources.Theme,
    @AttrRes attribute: Int): Int {
    val typedValue = TypedValue()
    theme.resolveAttribute(attribute, typedValue, true)
    return typedValue.data
  }

  /**
   * If a color is provided, use it. Otherwise, resolve the primary color of the current
   * theme.
   */

  @JvmStatic
  @ColorInt
  fun primaryColor(
    context: Context,
    @ColorInt providedColor: Int?): Int {
    return providedColor ?: resolveColorAttribute(context.theme, android.R.attr.colorPrimary)
  }
}