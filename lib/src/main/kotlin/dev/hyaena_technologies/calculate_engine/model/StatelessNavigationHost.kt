package dev.hyaena_technologies.calculate_engine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.hyaena_technologies.calculate_engine.widgets.StatefulScaffold

// Stateless Navigation Host
@Composable
fun StatelessNavigationHost(
    navigationController: NavHostController,
    initialDestination: String,
) {
    NavHost(
        navController = navigationController,
        startDestination = initialDestination
    ) {
        composable(route = "Home") {
            StatefulScaffold()
        }
    }
}