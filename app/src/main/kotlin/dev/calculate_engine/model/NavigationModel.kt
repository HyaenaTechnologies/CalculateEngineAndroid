package dev.calculate_engine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.calculate_engine.widgets.ConversionCalculatorRoute
import dev.calculate_engine.widgets.GitHubRoute
import dev.calculate_engine.widgets.HomeRoute
import dev.calculate_engine.widgets.OpenStaxRoute

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
            ConversionCalculatorRoute()
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