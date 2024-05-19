package dev.hyaena_technologies.calculate_engine.logic

// Average of Objects
fun average(values: Array<Double>): Double {
    var sum = 0.0
    for (value in values) {
        sum = sum + value
    }
    return sum / values.size
}