package calculate_engine.widgets

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
import calculate_engine.R
import calculate_engine.theme.bodyFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

// Stateless Drawer Widget
@Composable
fun StatelessDrawer(
    statelessDrawerScope: CoroutineScope,
    statelessDrawerState: DrawerState,
    statelessDrawerScrollState: ScrollState
) {
    BackHandler(enabled = statelessDrawerState.isOpen) {
        statelessDrawerScope.launch {
            statelessDrawerState.close()
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
                    Modifier.verticalScroll(statelessDrawerScrollState)
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
        drawerState = statelessDrawerState,
        gesturesEnabled = true,
    )
}