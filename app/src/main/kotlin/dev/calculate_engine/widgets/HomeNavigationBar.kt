package dev.calculate_engine.widgets

import androidx.compose.foundation.Image
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import dev.calculate_engine.R
import dev.calculate_engine.theme.bodyFontFamily

// Home Route Navigation Bar Widget: Stateless
@Composable
fun HomeNavigationBar(
    hostController: NavHostController,
) {
    val selectedIndex: MutableIntState = rememberSaveable {
        mutableIntStateOf(0)
    }
    NavigationBar {
        NavigationBarItem(
            alwaysShowLabel = false,
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
            onClick = {
                hostController.navigate(route = "In Development")
            },
            selected = false,
        )
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                Image(
                    contentDescription = "OpenStax",
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
            onClick = {
                hostController.navigate(route = "OpenStax")
            },
            selected = false,
        )
    }
}