package dev.calculate_engine.math.geometry

import dev.calculate_engine.math.constant.pi

// Volume of Objects

// Volume of a Cone
fun coneVolume(height: Double, radius: Double): Double {
    return (1 / 3) * (pi() * radius * radius) * height
}

// Volume of a Cube
fun cubeVolume(height: Double, length: Double, width: Double): Double {
    return height * length * width
}

// Volume of a Cuboid
fun cuboidVolume(height: Double, length: Double, width: Double): Double {
    return height * length * width
}

// Volume of a Cylinder
fun cylinderVolume(height: Double, radius: Double): Double {
    return pi() * height * (radius * radius)
}

// Volume of a Hemisphere
fun hemisphereVolume(radius: Double): Double {
    return (2 / 3) * (pi() * radius * radius * radius)
}

// Volume of a Prism
fun prismVolume(baseArea: Double, height: Double): Double {
    return baseArea * height
}

// Volume of a Pyramid
fun pyramidVolume(baseArea: Double, height: Double): Double {
    return (1 / 3) * (baseArea * height)
}

// Volume of a Sphere
fun sphereVolume(radius: Double): Double {
    return (4 / 3) * (pi() * radius * radius * radius)
}
