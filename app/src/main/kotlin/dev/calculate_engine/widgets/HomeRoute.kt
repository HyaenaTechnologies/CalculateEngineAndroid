package dev.calculate_engine.widgets

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import dev.calculate_engine.R
import dev.calculate_engine.theme.bodyFontFamily
import dev.calculate_engine.theme.displayFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

// Home Route Widget: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HomeRoute() {
    val coroutineScope: CoroutineScope = rememberCoroutineScope()
    val scrollState: ScrollState = rememberScrollState()
    val drawerState: DrawerState = rememberDrawerState(DrawerValue.Closed)
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    BackHandler(enabled = drawerState.isOpen) {
        coroutineScope.launch {
            drawerState.close()
        }
    }
    ModalNavigationDrawer(
        content = {
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
                    TopAppBar(
                        actions = {
                            IconButton(onClick = {}) {
                                Image(
                                    contentDescription = "Settings",
                                    painter = painterResource(id = R.drawable.settings)
                                )
                            }
                            IconButton(onClick = {}) {
                                Image(
                                    contentDescription = "Application Information",
                                    painter = painterResource(id = R.drawable.information)
                                )
                            }
                        },
                        navigationIcon = {
                            IconButton(
                                onClick = {
                                    coroutineScope.launch {
                                        drawerState.open()
                                    }
                                }
                            ) {
                                Image(
                                    contentDescription = "Menu",
                                    painter = painterResource(id = R.drawable.menu)
                                )
                            }
                        },
                        scrollBehavior = topBarScroll,
                        title = {
                            Text(
                                "Home",
                                fontFamily = displayFontFamily,
                                maxLines = 1,
                                softWrap = true,
                            )
                        },
                    )
                },
            )
        },
        drawerContent = {
            ModalDrawerSheet {
                Column(
                    Modifier.verticalScroll(scrollState)
                ) {
                    NavigationDrawerItem(
                        icon = {
                            Image(
                                contentDescription = "Algebra",
                                painter = painterResource(id = R.drawable.parabola)
                            )
                        },
                        label = {
                            Text(
                                "Algebra",
                                fontFamily = bodyFontFamily,
                                maxLines = 1,
                                softWrap = true,
                            )
                        },
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        onClick = {},
                        selected = false,
                    )
                }
            }
        },
        drawerState = drawerState,
        gesturesEnabled = true,
    )
}