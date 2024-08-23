package dev.calculate_engine.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

// OpenStax Route: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun OpenStax(
    navigationHost: NavHostController
) {
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        content = { innerPadding ->
            Column(
                modifier = Modifier.consumeWindowInsets(innerPadding)
            ) {

            }
        },
        topBar = {
            NavigationTopBar(
                appBarScroll = topBarScroll,
                hostController = navigationHost,
                titleText = "OpenStax"
            )
        },
    )
}