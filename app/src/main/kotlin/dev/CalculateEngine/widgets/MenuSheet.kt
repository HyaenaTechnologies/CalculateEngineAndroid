package dev.CalculateEngine.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavHostController
import dev.CalculateEngine.R
import dev.CalculateEngine.theme.bodyFontFamily

// Home Route Drawer Sheet: Stateless
@Composable
fun MenuSheet(
    hostController: NavHostController,
    menuScrollState: ScrollState
) {
    ModalDrawerSheet {
        Column(
            Modifier.verticalScroll(menuScrollState)
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
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "In Development")
                },
                selected = false,
            )
            NavigationDrawerItem(
                icon = {
                    Image(
                        contentDescription = "Calculus",
                        painter = painterResource(id = R.drawable.summation)
                    )
                },
                label = {
                    Text(
                        "Calculus",
                        fontFamily = bodyFontFamily,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "In Development")
                },
                selected = false,
            )
            NavigationDrawerItem(
                icon = {
                    Image(
                        contentDescription = "Chemistry",
                        painter = painterResource(id = R.drawable.chemistry)
                    )
                },
                label = {
                    Text(
                        "Chemistry",
                        fontFamily = bodyFontFamily,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "In Development")
                },
                selected = false,
            )
            NavigationDrawerItem(
                icon = {
                    Image(
                        contentDescription = "Conversion",
                        painter = painterResource(id = R.drawable.filter)
                    )
                },
                label = {
                    Text(
                        "Conversion",
                        fontFamily = bodyFontFamily,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "In Development")
                },
                selected = false,
            )
            NavigationDrawerItem(
                icon = {
                    Image(
                        contentDescription = "GitHub",
                        painter = painterResource(id = R.drawable.web_dev)
                    )
                },
                label = {
                    Text(
                        "GitHub Source",
                        fontFamily = bodyFontFamily,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "GitHub")
                },
                selected = false,
            )
            NavigationDrawerItem(
                icon = {
                    Image(
                        contentDescription = "Physics",
                        painter = painterResource(id = R.drawable.atom)
                    )
                },
                label = {
                    Text(
                        "Physics",
                        fontFamily = bodyFontFamily,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "In Development")
                },
                selected = false,
            )
            NavigationDrawerItem(
                icon = {
                    Image(
                        contentDescription = "Statistics",
                        painter = painterResource(id = R.drawable.analysis)
                    )
                },
                label = {
                    Text(
                        "Statistics",
                        fontFamily = bodyFontFamily,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "In Development")
                },
                selected = false,
            )
            NavigationDrawerItem(
                icon = {
                    Image(
                        contentDescription = "Trigonometry",
                        painter = painterResource(id = R.drawable.trigonometry)
                    )
                },
                label = {
                    Text(
                        "Trigonometry",
                        fontFamily = bodyFontFamily,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "In Development")
                },
                selected = false,
            )
        }
    }
}