package dev.calculate_engine.widgets

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

// GitHub Source Route: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GitHubSource(
    navigationHost: NavHostController
) {
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        content = { innerPadding ->
            Column(
                modifier = Modifier.consumeWindowInsets(innerPadding)
            ) {
                Card(
                    onClick = {},
                    modifier = Modifier.size(
                        width = 180.dp,
                        height = 100.dp
                    )
                ) {
                    Box(
                        Modifier.fillMaxSize()
                    ) {
                        Text(
                            "Clickable",
                            Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        },
        topBar = {
            NavigationTopBar(
                appBarScroll = topBarScroll,
                hostController = navigationHost,
                titleText = "GitHub Source"
            )
        },
    )
}