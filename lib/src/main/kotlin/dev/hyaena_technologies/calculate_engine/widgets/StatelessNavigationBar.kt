package dev.hyaena_technologies.calculate_engine.widgets

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.hyaena_technologies.calculate_engine.R
import dev.hyaena_technologies.calculate_engine.theme.bodyFontFamily

// Stateless Navigation Bar Widget
@Composable
fun StatelessNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                R.raw.calculator
            },
            label = {
                Text(
                    "Basic",
                    fontFamily = bodyFontFamily,
                    maxLines = 1,
                    softWrap = true,
                )
            },
            onClick = {},
            selected = false,
        )
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                R.raw.book
            },
            label = {
                Text(
                    "OpenStax",
                    fontFamily = bodyFontFamily,
                    maxLines = 1,
                    softWrap = true,
                )
            },
            onClick = {},
            selected = false,
        )
    }
}