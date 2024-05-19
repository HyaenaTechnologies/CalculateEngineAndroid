package dev.hyaena_technologies.calculate_engine.logic

// Volume of Objects
class Volume {
    // Volume of a Cone
    fun cone(height: Double, radius: Double): Double {
        return (pi() * height * radius * radius) / 3
    }

    // Volume of a Cube
    fun cube(length: Double): Double {
        return length * length * length
    }

    // Volume of a Cuboid
    fun cuboid(height: Double, length: Double, width: Double): Double {
        return height * length * width
    }

    // Volume of a Cylinder
    fun cylinder(height: Double, radius: Double): Double {
        return pi() * height * radius * radius
    }

    // Volume of a Hemisphere
    fun hemisphere(radius: Double): Double {
        return (pi() * radius * radius * radius * 2) / 3
    }

    // Volume of a Prism
    fun prism(baseArea: Double, height: Double): Double {
        return baseArea * height
    }

    // Volume of a Pyramid
    fun pyramid(baseArea: Double, height: Double): Double {
        return (baseArea * height) / 2
    }

    // Volume of a Sphere
    fun sphere(radius: Double): Double {
        return (pi() * radius * radius * radius * 4) / 3
    }
}