package com.assignment.budgetApp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import com.assignment.budgetApp.ui.theme.Destructive
import com.assignment.budgetApp.ui.theme.Primary
import com.assignment.budgetApp.ui.theme.Shapes
import com.assignment.budgetApp.ui.theme.Surface
import com.assignment.budgetApp.ui.theme.TextPrimary
import com.assignment.budgetApp.ui.theme.Typography

private val DarkColorPalette = darkColorScheme(
  primary = Primary,
  background = Surface,
  surface = Surface,
  error = Destructive,
  onPrimary = TextPrimary,
  onSecondary = TextPrimary,
  onBackground = TextPrimary,
  onSurface = TextPrimary,
  onError = TextPrimary,

  /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun BudgetAppTheme(
  content: @Composable () -> Unit
) {
  val colors = DarkColorPalette

  MaterialTheme(
    colorScheme = colors,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}