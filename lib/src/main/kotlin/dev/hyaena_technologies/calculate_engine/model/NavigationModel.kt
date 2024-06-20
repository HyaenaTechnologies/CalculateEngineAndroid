package dev.hyaena_technologies.calculate_engine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphNavigator
import androidx.navigation.NavHostController
import androidx.navigation.NavigatorProvider
import androidx.navigation.compose.rememberNavController

// Navigation Model
class NavigationModel {

}

// Not Finished - Refactor Graph to Reduce Objects
@Composable
fun NavigationGraphModel() {
    val graphProvider = NavigatorProvider()
    val graphNavigator = NavGraphNavigator(graphProvider)
    val navigationControl: NavHostController = rememberNavController()
    val navigationGraph = NavGraph(graphNavigator)
}