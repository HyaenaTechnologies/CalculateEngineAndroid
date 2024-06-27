package dev.hyaenaTechnologies.calculateEngine.logic.math

// Absolute Value of Objects
fun absoluteValue(value: Double): Double {
    if (value < 0) {
        return -value
    } else {
        return value
    }
}