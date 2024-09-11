package dev.calculate_engine.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.calculate_engine.R
import dev.calculate_engine.theme.titleFontFamily

// OpenStax Route: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun OpenStax(
    navigationHost: NavHostController
) {
    Scaffold(
        content = { innerPadding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.consumeWindowInsets(innerPadding),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                ExpandableCard(
                    actionButton = {
                        FloatingActionButton(
                            content = {
                                Text(
                                    "Visit OpenStax",
                                    fontFamily = titleFontFamily,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    softWrap = true
                                )
                            },
                            elevation = FloatingActionButtonDefaults.elevation(6.dp),
                            modifier = Modifier.align(Alignment.End),
                            onClick = {

                            },
                            shape = RoundedCornerShape(size = 6.dp)
                        )
                    },
                    headerImage = {
                        Image(
                            contentDescription = "OpenStax Logo",
                            painter = painterResource(id = R.drawable.openstax)
                        )
                    },
                    title = "OpenStax"
                )

            }
        }
    )
}