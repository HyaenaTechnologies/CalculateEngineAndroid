package dev.CalculateEngine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import dev.CalculateEngine.model.NavigationModel
import dev.CalculateEngine.theme.CalculateEngineTheme

// Main Activity: Main Entrypoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculateEngineTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    content = {
                        NavigationModel()
                    }
                )
            }
        }
    }
}