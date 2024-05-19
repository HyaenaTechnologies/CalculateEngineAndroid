package dev.hyaena_technologies.calculate_engine.logic

// Absolute Value of Objects
fun absoluteValue(value: Double): Double {
    if (value < 0) {
        return -value
    } else {
        return value
    }
}