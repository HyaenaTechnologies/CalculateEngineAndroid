package dev.hyaena_technologies.calculate_engine.logic

// Area of Objects
class Area {
    // Area of a Cube
    fun cube(length: Double): Double {
        return length * length * 6
    }

    // Area of a Parallelogram
    fun parallelogram(base: Double, height: Double): Double {
        return base * height
    }

    // Area of a Rectangle
    fun rectangle(length: Double, width: Double): Double {
        return length * width
    }

    // Area of a Square
    fun square(length: Double): Double {
        return length * length
    }

    // Area of a Trapezium
    fun trapezium(baseOne: Double, baseTwo: Double, height: Double): Double {
        return (baseOne + baseTwo) * height / 2
    }

    // Area of a Triangle
    fun triangle(base: Double, height: Double): Double {
        return base * height / 2
    }
}