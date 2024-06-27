package dev.hyaenaTechnologies.calculateEngine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.hyaenaTechnologies.calculateEngine.widgets.BasicCalculatorRoute
import dev.hyaenaTechnologies.calculateEngine.widgets.GitHubRoute
import dev.hyaenaTechnologies.calculateEngine.widgets.HomeRoute
import dev.hyaenaTechnologies.calculateEngine.widgets.OpenStaxRoute

// Navigation Model: Stateless
@Composable
fun NavigationModel(
    initialDestination: String,
    navigationController: NavHostController
) {
    NavHost(
        navController = navigationController,
        startDestination = initialDestination
    ) {
        composable(route = "Basic Calculator") {
            BasicCalculatorRoute()
        }

        composable(route = "Home") {
            HomeRoute()
        }

        composable(route = "GitHub") {
            GitHubRoute()
        }

        composable(route = "OpenStax") {
            OpenStaxRoute()
        }
    }
}