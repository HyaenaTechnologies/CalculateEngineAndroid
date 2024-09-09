package dev.calculate_engine.widgets

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.calculate_engine.R
import dev.calculate_engine.theme.titleFontFamily

// GitHub Source Route: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GitHubSource(
    navigationHost: NavHostController
) {
    var expandedState: Boolean by rememberSaveable {
        mutableStateOf(false)
    }
    val rotationState: Float by animateFloatAsState(
        targetValue = if (expandedState == true) {
            180f
        } else {
            0f
        }
    )
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        content = { innerPadding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.consumeWindowInsets(innerPadding),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    onClick = {},
                    modifier = Modifier
                        .animateContentSize(
                            animationSpec = tween(
                                durationMillis = 300,
                                easing = LinearOutSlowInEasing
                            )
                        )
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(size = 6.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            contentDescription = "Down Arrow",
                            painter = painterResource(id = R.drawable.hce_markdown)
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "GitHub Source",
                                fontFamily = titleFontFamily,
                                maxLines = 1,
                                modifier = Modifier.weight(5f),
                                overflow = TextOverflow.Ellipsis,
                                softWrap = true
                            )
                            IconButton(
                                modifier = Modifier
                                    .weight(1f)
                                    .rotate(rotationState),
                                onClick = {
                                    expandedState = true
                                }
                            ) {
                                Image(
                                    contentDescription = "Down Arrow",
                                    painter = painterResource(id = R.drawable.down_arrow)
                                )
                            }
                        }
                        if (expandedState == true) {
                            Text(
                                    "Place Holder",
                                    fontFamily = titleFontFamily,
                                    maxLines = 1,
                                    modifier = Modifier.weight(5f),
                                    overflow = TextOverflow.Ellipsis,
                                    softWrap = true
                                )
                            }
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