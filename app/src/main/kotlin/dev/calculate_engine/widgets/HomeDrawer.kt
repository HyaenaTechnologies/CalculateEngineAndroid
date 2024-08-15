package dev.calculate_engine.widgets

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DismissibleDrawerSheet
import androidx.compose.material3.DismissibleNavigationDrawer
import androidx.compose.material3.DrawerState
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.calculate_engine.R
import dev.calculate_engine.theme.bodyFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

// Home Route Drawer Widget: Stateless
@Composable
fun HomeDrawer(
    homeDrawerScope: CoroutineScope,
    homeDrawerScrollState: ScrollState,
    homeDrawerState: DrawerState
) {
    BackHandler(enabled = homeDrawerState.isOpen) {
        homeDrawerScope.launch {
            homeDrawerState.close()
        }
    }
    DismissibleNavigationDrawer(
        content = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {

            }
        },
        drawerContent = {
            DismissibleDrawerSheet {
                Column(
                    Modifier.verticalScroll(homeDrawerScrollState)
                ) {
                    NavigationDrawerItem(
                        icon = {
                            R.raw.parabola
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
        drawerState = homeDrawerState,
        gesturesEnabled = true,
    )
}