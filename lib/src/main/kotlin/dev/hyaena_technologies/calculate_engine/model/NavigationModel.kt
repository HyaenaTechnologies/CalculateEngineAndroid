package dev.hyaena_technologies.calculate_engine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphNavigator
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
        navigationController: NavHostController,
        navigationGraphNavigator: NavGraphNavigator
    ) {
        val navigationGraph = NavGraph(navigationGraphNavigator)
        navigationGraph.setStartDestination("Home")

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