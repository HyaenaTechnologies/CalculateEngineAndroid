package dev.hyaena_technologies.calculate_engine.logic.math

// Exponential Power of Objects
fun power(value: Double, exponent: Double): Double {
    var sum: Double = power(value, exponent / 2)

    if (exponent == 0.0) {
        return 1.0
    }

    if (exponent == 1.0) {
        return value
    }

    if (exponent == 2.0) {
        return value * value
    }

    return value * sum * sum
}