package dev.hyaena_technologies.calculate_engine.logic.math

// Area of Objects
class Area {
    // Area of a Circle
    fun circle(radius: Double): Double {
        return pi() * (radius * radius)
    }

    // Area of a Cube
    fun cube(length: Double, width: Double): Double {
        return 6 * (length * width)
    }

    // Area of a Cylinder
    fun cylinder(height: Double, radius: Double): Double {
        return (2 * pi() * radius * radius) + (2 * height * pi() * radius)
    }

    // Area of a Hemisphere
    fun hemisphere(radius: Double): Double {
        return 3 * (pi() * radius * radius)
    }

    // Area of a Parallelogram
    fun parallelogram(base: Double, height: Double): Double {
        return base * height
    }

    // Area of a Rectangle
    fun rectangle(length: Double, width: Double): Double {
        return length * width
    }

    // Area of a Sphere
    fun sphere(radius: Double): Double {
        return 4 * (pi() * radius * radius) 
    }

    // Area of a Square
    fun square(length: Double, width: Double): Double {
        return length * width
    }

    // Area of a Trapezium
    fun trapezium(baseOne: Double, baseTwo: Double, height: Double): Double {
        return (1 / 2) * (baseOne + baseTwo) * height
    }

    // Area of a Triangle
    fun triangle(base: Double, height: Double): Double {
        return (1 / 2) * base * height
    }
}