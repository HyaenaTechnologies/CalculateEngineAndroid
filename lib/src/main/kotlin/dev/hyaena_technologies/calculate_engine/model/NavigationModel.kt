package dev.hyaena_technologies.calculate_engine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.hyaena_technologies.calculate_engine.widgets.HomeRoute

// Navigation Model: Graph - Host
class NavigationModel(

) {
    @Composable
    fun NavigationGraphModel(
        initialDestination: String,
        navigationController: NavHostController
    ) {
        NavHost(
            navController = navigationController,
            startDestination = initialDestination
        ) {
            composable(route = "Home") {
                HomeRoute()
            }
        }
    }
}