package dev.hyaena_technologies.calculate_engine.logic.math.geometry

import dev.hyaena_technologies.calculate_engine.logic.math.constant.Pi

// Volume of Objects

// Volume of a Cone
fun ConeVolume(height: Double, radius: Double): Double {
    return (1 / 3) * (Pi() * radius * radius) * height
}

// Volume of a Cube
fun CubeVolume(height: Double, length: Double, width: Double): Double {
    return height * length * width
}

// Volume of a Cuboid
fun CuboidVolume(height: Double, length: Double, width: Double): Double {
    return height * length * width
}

// Volume of a Cylinder
fun CylinderVolume(height: Double, radius: Double): Double {
    return Pi() * height * (radius * radius)
}

// Volume of a Hemisphere
fun HemisphereVolume(radius: Double): Double {
    return (2 / 3) * (Pi() * radius * radius * radius)
}

// Volume of a Prism
fun PrismVolume(baseArea: Double, height: Double): Double {
    return baseArea * height
}

// Volume of a Pyramid
fun PyramidVolume(baseArea: Double, height: Double): Double {
    return (1/ 3) * (baseArea * height)
}

// Volume of a Sphere
fun SphereVolume(radius: Double): Double {
    return (4 / 3) * (Pi() * radius * radius * radius)
}
