package dev.hyaena_technologies.calculate_engine.logic.math.conversion

// Centimeter Conversion
class CentimeterConversion {
    // Centimeters to Kilometers
    fun CentimeterToKilometer(kilometers: Double): Double {
        val centimeter: Double = kilometers * 100000
        return centimeter
    }

    // Centimeters to Meters
    fun CentimeterToMeter(meter: Double): Double {
        val centimeter: Double = meter * 100
        return centimeter
    }
}