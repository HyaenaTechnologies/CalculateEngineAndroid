package dev.hyaena_technologies.calculate_engine.widgets

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.DismissibleDrawerSheet
import androidx.compose.material3.DismissibleNavigationDrawer
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

// Home Route Drawer
@Composable
fun HomeDrawer() {
    val homeDrawerItemList = listOf(
        Icons.Default.Favorite,
        Icons.Default.Face,
        Icons.Default.Email,
    )
    val homeDrawerScope = rememberCoroutineScope()
    val homeDrawerState = rememberDrawerState(DrawerValue.Closed)
    val selectedItem = remember {
        mutableStateOf(homeDrawerItemList[0])
    }
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
                Spacer(Modifier.height(12.dp))
                homeDrawerItemList.forEach { homeRouteNavigationDrawerItem ->
                    NavigationDrawerItem(
                        icon = {
                            Icon(
                                homeRouteNavigationDrawerItem,
                                contentDescription = null
                            )
                        },
                        label = { Text(homeRouteNavigationDrawerItem.name) },
                        modifier = Modifier.padding(horizontal = 12.dp),
                        onClick = {
                            homeDrawerScope.launch {
                                homeDrawerState.close()
                            }
                            selectedItem.value =
                                homeRouteNavigationDrawerItem
                        },
                        selected = homeRouteNavigationDrawerItem ==
                                selectedItem.value,
                    )
                }
            }
        },
        drawerState = homeDrawerState,
        gesturesEnabled = true,
    )
}