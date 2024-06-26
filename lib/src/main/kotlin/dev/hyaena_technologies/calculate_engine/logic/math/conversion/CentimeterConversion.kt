package dev.hyaena_technologies.calculate_engine.logic.math.conversion

// Centimeter Conversion
class CentimeterConversion {
    // Decameters to Centimeters
    fun DecametersToCentimeters(decameters: Double): Double {
        val centimeters: Double = decameters * 1000
        return centimeters
    }

    // Decimeters to Centimeters
    fun DecimetersToCentimeters(decimeters: Double): Double {
        val centimeters: Double = decimeters * 10
        return centimeters
    }

    // Hectometers to Centimeters
    fun HectometersToCentimeters(hectometers: Double): Double {
        val centimeters: Double = hectometers * 10000
        return centimeters
    }

    // Kilometers to Centimeters
    fun KilometersToCentimeters(kilometers: Double): Double {
        val centimeters: Double = kilometers * 100000
        return centimeters
    }

    // Picometers to Centimeters
    fun PicometersToCentimeters(picometers: Double): Double {
        val centimeters: Double = picometers * -10000000000
        return centimeters
    }

    // Meters to Centimeters
    fun MetersToCentimeters(meters: Double): Double {
        val centimeters: Double = meters * 100
        return centimeters
    }

    // Micrometers to Centimeters
    fun MicrometersToCentimeters(micrometers: Double): Double {
        val centimeters: Double = micrometers * -10000
        return centimeters
    }

    // Millimeters to Centimeters
    fun MillimetersToCentimeters(millimeters: Double): Double {
        val centimeters: Double = millimeters * 0.1
        return centimeters
    }

    // Nanometers to Centimeters
    fun NanometersToCentimeters(nanometers: Double): Double {
        val centimeters: Double = nanometers * -10000000
        return centimeters
    }
}