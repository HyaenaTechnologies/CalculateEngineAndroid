package dev.hyaena_technologies.calculate_engine.logic.state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import dev.hyaena_technologies.calculate_engine.widgets.StatelessDrawer
import kotlinx.coroutines.CoroutineScope

// Stateful Widgets
class StatefulWidget(
    val scope: CoroutineScope
) {
    // Stateful Drawer Widget
    @Composable
    fun StatefulDrawer() {
        val widgetScope = StatefulWidget(rememberCoroutineScope())
        StatelessDrawer(homeDrawerScope = widgetScope.scope)
    }
}