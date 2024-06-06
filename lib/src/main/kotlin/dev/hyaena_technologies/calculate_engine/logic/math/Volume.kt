package dev.hyaena_technologies.calculate_engine.logic.math

// Volume of Objects
class Volume {
    // Volume of a Cone
    fun Cone(height: Double, radius: Double): Double {
        return (1 / 3) * (Pi() * radius * radius) * height
    }

    // Volume of a Cube
    fun Cube(height: Double, length: Double, width: Double): Double {
        return height * length * width
    }

    // Volume of a Cuboid
    fun Cuboid(height: Double, length: Double, width: Double): Double {
        return height * length * width
    }

    // Volume of a Cylinder
    fun Cylinder(height: Double, radius: Double): Double {
        return Pi() * height * (radius * radius)
    }

    // Volume of a Hemisphere
    fun Hemisphere(radius: Double): Double {
        return (2 / 3) * (Pi() * radius * radius * radius)
    }

    // Volume of a Prism
    fun Prism(baseArea: Double, height: Double): Double {
        return baseArea * height
    }

    // Volume of a Pyramid
    fun Pyramid(baseArea: Double, height: Double): Double {
        return (1/ 3) * (baseArea * height)
    }

    // Volume of a Sphere
    fun Sphere(radius: Double): Double {
        return (4 / 3) * (Pi() * radius * radius * radius)
    }
}