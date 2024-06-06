package dev.hyaena_technologies.calculate_engine.logic.math

// Absolute Value of Objects
fun AbsoluteValue(value: Double): Double {
    if (value < 0) {
        return -value
    } else {
        return value
    }
}