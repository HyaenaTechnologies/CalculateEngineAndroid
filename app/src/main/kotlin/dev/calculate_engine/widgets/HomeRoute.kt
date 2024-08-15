package dev.calculate_engine.widgets

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope

// Home Route: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HomeRoute() {
    val drawerState: DrawerState = rememberDrawerState(DrawerValue.Closed)
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    val widgetScope: CoroutineScope = rememberCoroutineScope()
    val widgetScrollState: ScrollState = rememberScrollState()
    HomeDrawer(widgetScope, widgetScrollState, drawerState)
    Scaffold(
        bottomBar = {
            HomeNavigationBar()
        },
        content = { innerPadding ->
            LazyColumn(
                contentPadding = innerPadding,
                modifier = Modifier.consumeWindowInsets(innerPadding)
            ) {

            }
        },
        topBar = {
            HomeTopAppBar(topBarScroll)
        },
    )
}