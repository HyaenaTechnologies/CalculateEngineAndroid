package dev.hyaena_technologies.calculate_engine.logic

// Volume of Objects
class Volume {
    // Volume of a Cube
    fun cube(length: Double): Double {
        return length * length * length
    }

    // Volume of a Cuboid
    fun cuboid(height: Double, length: Double, width: Double): Double {
        return height * length * width
    }
}