package dev.CalculateEngine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.CalculateEngine.widgets.ConversionCalculator
import dev.CalculateEngine.widgets.GitHubSource
import dev.CalculateEngine.widgets.HomeRoute
import dev.CalculateEngine.widgets.InDevelopment
import dev.CalculateEngine.widgets.OpenStax

// Navigation Model: Stateful
@Composable
fun NavigationModel() {
    val navigationController: NavHostController = rememberNavController()
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
            HomeRoute(navigationHost = navigationController)
        }

        composable(route = "In Development") {
            InDevelopment(navigationHost = navigationController)
        }

        composable(route = "OpenStax") {
            OpenStax(navigationHost = navigationController)
        }
    }
}