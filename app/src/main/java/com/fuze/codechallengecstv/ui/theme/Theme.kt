package com.fuze.codechallengecstv.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = AccentRed,
    secondary = TextGrey_Dark,
    background = DarkPurple_Background,
    surface = DarkPurple_Surface,
    onPrimary = TextWhite,
    onSecondary = DarkPurple_Background,
    onBackground = TextWhite,
    onSurface = TextWhite,
    error = AccentRed,
    onError = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = AccentRed,
    secondary = SecondaryTextGrey_Light,
    background = LightGrey_Background,
    surface = White_Surface,
    onPrimary = TextWhite,
    onSecondary = TextWhite,
    onBackground = DarkText_Light,
    onSurface = DarkText_Light,
    error = AccentRed,
    onError = Color.White
)

@Composable
fun CodeChallengeCSTVTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}