package dev.calculate_engine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import dev.calculate_engine.model.NavigationModel
import dev.calculate_engine.theme.CalculateEngineTheme
import dev.calculate_engine.widgets.HomeRoute

// Main Activity: Main Entrypoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculateEngineTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    HomeRoute()
                    NavigationModel()
                }
            }
        }
    }
}