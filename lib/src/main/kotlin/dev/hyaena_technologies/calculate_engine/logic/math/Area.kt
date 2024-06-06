package dev.hyaena_technologies.calculate_engine.logic.math

// Area of Objects
class Area {
    // Area of a Circle
    fun Circle(radius: Double): Double {
        return Pi() * (radius * radius)
    }

    // Area of a Cube
    fun Cube(length: Double, width: Double): Double {
        return 6 * (length * width)
    }

    // Area of a Cylinder
    fun Cylinder(height: Double, radius: Double): Double {
        return (2 * height * Pi() * radius) + (2 * Pi() * radius * radius)
    }

    // Area of a Hemisphere
    fun Hemisphere(radius: Double): Double {
        return 3 * (Pi() * radius * radius)
    }

    // Area of a Parallelogram
    fun Parallelogram(base: Double, height: Double): Double {
        return base * height
    }

    // Area of a Rectangle
    fun Rectangle(length: Double, width: Double): Double {
        return length * width
    }

    // Area of a Sphere
    fun Sphere(radius: Double): Double {
        return 4 * (Pi() * radius * radius) 
    }

    // Area of a Square
    fun Square(length: Double, width: Double): Double {
        return length * width
    }

    // Area of a Trapezium
    fun Trapezium(baseOne: Double, baseTwo: Double, height: Double): Double {
        return (1 / 2) * (baseOne + baseTwo) * height
    }

    // Area of a Triangle
    fun Triangle(base: Double, height: Double): Double {
        return (1 / 2) * base * height
    }
}