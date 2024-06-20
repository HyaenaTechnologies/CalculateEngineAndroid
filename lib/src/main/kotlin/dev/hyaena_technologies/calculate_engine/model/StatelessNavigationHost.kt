package dev.hyaena_technologies.calculate_engine.model

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

// Stateless Navigation Host
@Composable
fun StatelessNavigationHost(
    navigationController: NavHostController,
    navigationGraph: NavGraph
) {
    NavHost(
        navController = navigationController,
        graph = navigationGraph
    )
}