package com.fuze.codechallengecstv.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes: Shapes = Shapes(
    small = RoundedCornerShape(8.dp),     // For smaller elements like player images
    medium = RoundedCornerShape(16.dp),    // For main content cards
    large = RoundedCornerShape(24.dp)
)