package dev.calculate_engine.widgets

import androidx.compose.foundation.Image
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import dev.calculate_engine.R
import dev.calculate_engine.theme.bodyFontFamily

// Home Route Navigation Bar Widget: Stateless
@Composable
fun HomeNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            alwaysShowLabel = true,
            enabled = true,
            icon = {
                Image(
                    contentDescription = "Basic Calculator",
                    painter = painterResource(id = R.drawable.calculator)
                )
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
            alwaysShowLabel = true,
            enabled = true,
            icon = {
                Image(
                    contentDescription = "Basic Calculator",
                    painter = painterResource(id = R.drawable.book)
                )
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