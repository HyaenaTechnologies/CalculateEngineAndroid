package dev.hyaena_technologies.calculate_engine.widgets

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Home Route Widgets
@Composable
fun HomeRoute() {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize(),
    ) {
        Scaffold(
            bottomBar = {
                HomeNavigationBar()
            },
            content = { innerPadding ->
                LazyColumn(
                    modifier = Modifier.consumeWindowInsets(innerPadding),
                    contentPadding = innerPadding
                ) {

                }
            },
            drawerContent = {
                StatelessDrawer()
            },
            drawerElevation = 6.dp,
            topBar = {
                HomeTopAppBar()
            },
        )
    }
}