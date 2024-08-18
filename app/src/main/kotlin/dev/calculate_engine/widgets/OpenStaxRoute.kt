package dev.calculate_engine.widgets

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// OpenStax Route: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun OpenStaxRoute() {
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        content = { innerPadding ->
            LazyColumn(
                contentPadding = innerPadding,
                modifier = Modifier.consumeWindowInsets(innerPadding)
            ) {

            }
        },
        topBar = {

        },
    )
}