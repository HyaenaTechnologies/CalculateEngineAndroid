package dev.calculate_engine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.calculate_engine.widgets.ConversionCalculator
import dev.calculate_engine.widgets.GitHubSource
import dev.calculate_engine.widgets.HomeRoute
import dev.calculate_engine.widgets.InDevelopment
import dev.calculate_engine.widgets.OpenStax

// Navigation Model: Stateful
@Composable
fun NavigationModel(
) {
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