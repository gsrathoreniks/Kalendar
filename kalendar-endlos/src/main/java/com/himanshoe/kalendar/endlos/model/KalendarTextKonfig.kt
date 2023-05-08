package com.himanshoe.kalendar.endlos.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

data class KalendarTextKonfig(
    val kalendarTextColor: Color,
    val kalendarTextSize: TextUnit
) {
    companion object {
        internal fun previewDefault() = KalendarTextKonfig(
            kalendarTextSize = 24.sp,
            kalendarTextColor = Color(0xFFD2827A)
        )
    }
}