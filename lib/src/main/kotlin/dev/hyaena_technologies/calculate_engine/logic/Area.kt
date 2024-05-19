package dev.hyaena_technologies.calculate_engine.logic

// Area of Objects
class Area {
    // Area of a Circle
    fun circle(radius: Double): Double {
        return pi() * radius * radius
    }

    // Area of a Cube
    fun cube(length: Double): Double {
        return length * length * 6
    }

    // Area of a Cylinder
    fun cylinder(height: Double, radius: Double): Double {
        return (pi() * radius * radius + pi() * radius * height) * 2
    }

    // Area of a Hemisphere
    fun hemisphere(radius: Double): Double {
        return pi() * radius * radius * 3
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
        return pi() * radius * radius * 4
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