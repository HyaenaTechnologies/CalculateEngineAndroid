package dev.calculate_engine.logic.math.geometry

import dev.hyaenaTechnologies.calculateEngine.logic.math.constant.Pi

// Volume of Objects

// Volume of a Cone
fun coneVolume(height: Double, radius: Double): Double {
    return (1 / 3) * (Pi() * radius * radius) * height
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
    return Pi() * height * (radius * radius)
}

// Volume of a Hemisphere
fun hemisphereVolume(radius: Double): Double {
    return (2 / 3) * (Pi() * radius * radius * radius)
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
    return (4 / 3) * (Pi() * radius * radius * radius)
}
