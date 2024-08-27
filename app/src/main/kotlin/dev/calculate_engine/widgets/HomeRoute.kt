package dev.calculate_engine.widgets

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.calculate_engine.R
import dev.calculate_engine.theme.displayFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

// Home Route Widget: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HomeRoute() {
    val coroutineScope: CoroutineScope = rememberCoroutineScope()
    val drawerState: DrawerState = rememberDrawerState(DrawerValue.Closed)
    val navigationController: NavHostController = rememberNavController()
    val scrollState: ScrollState = rememberScrollState()
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
                    Column(
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
            MenuSheet(
                hostController = navigationController,
                menuScrollState = scrollState
            )
        },
        drawerState = drawerState,
        gesturesEnabled = true,
    )
    NavHost(
        navController = navigationController,
        startDestination = "Home"
    ) {
        composable(route = "Conversion Calculator") {
            ConversionCalculator(navigationHost = navigationController)
        }

        composable(route = "GitHub") {
            GitHubSource(navigationHost = navigationController)
        }

        composable(route = "Home") {
            HomeRoute()
        }

        composable(route = "In Development") {
            InDevelopment(navigationHost = navigationController)
        }

        composable(route = "OpenStax") {
            OpenStax(navigationHost = navigationController)
        }
    }
}