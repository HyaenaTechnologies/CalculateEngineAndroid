package dev.CalculateEngine.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

// Conversion Calculator Route: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ConversionCalculator(
    navigationHost: NavHostController
) {
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        content = { innerPadding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.consumeWindowInsets(innerPadding),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

            }
        },
        topBar = {
            NavigationTopBar(
                appBarScroll = topBarScroll,
                hostController = navigationHost,
                titleText = "Conversion"
            )
        },
    )
}