package dev.hyaena_technologies.calculate_engine.logic.math

// Volume of Objects
class Volume {
    // Volume of a Cone
    fun cone(height: Double, radius: Double): Double {
        return (1 / 3) * (pi() * radius * radius) * height
    }

    // Volume of a Cube
    fun cube(height: Double, length: Double, width: Double): Double {
        return height * length * width
    }

    // Volume of a Cuboid
    fun cuboid(height: Double, length: Double, width: Double): Double {
        return height * length * width
    }

    // Volume of a Cylinder
    fun cylinder(height: Double, radius: Double): Double {
        return pi() * height * (radius * radius)
    }

    // Volume of a Hemisphere
    fun hemisphere(radius: Double): Double {
        return (2 / 3) * (pi() * radius * radius * radius)
    }

    // Volume of a Prism
    fun prism(baseArea: Double, height: Double): Double {
        return baseArea * height
    }

    // Volume of a Pyramid
    fun pyramid(baseArea: Double, height: Double): Double {
        return (1/ 3) * (baseArea * height)
    }

    // Volume of a Sphere
    fun sphere(radius: Double): Double {
        return (4 / 3) * (pi() * radius * radius * radius)
    }
}