package dev.hyaena_technologies.calculate_engine.widgets

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.hyaena_technologies.calculate_engine.R

// Home Route Navigation Bar
@Composable
fun HomeNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                R.raw.calculator
            },
            label = { Text("Basic") },
            onClick = {},
            selected = false,
        )
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                R.raw.book
            },
            label = { Text("OpenStax") },
            onClick = {},
            selected = false,
        )
    }
}