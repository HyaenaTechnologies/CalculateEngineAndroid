package dev.hyaena_technologies.calculate_engine.logic

// Average of Objects
fun average(values: Array<Double>): Double {
    var result = 0.0
    for (value in values) {
        result = result + value
    }
    return result / values.size
}