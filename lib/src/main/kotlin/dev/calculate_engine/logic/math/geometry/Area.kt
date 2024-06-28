package dev.calculate_engine.logic.math.geometry

import dev.hyaenaTechnologies.calculateEngine.logic.math.constant.Pi

// Area of Objects

// Area of a Circle
fun circleArea(radius: Double): Double {
    return Pi() * (radius * radius)
}

// Area of a Cube
fun cubeArea(length: Double, width: Double): Double {
    return 6 * (length * width)
}

// Area of a Cylinder
fun cylinderArea(height: Double, radius: Double): Double {
    return (2 * height * Pi() * radius) + (2 * Pi() * radius * radius)
}

// Area of a Hemisphere
fun hemisphereArea(radius: Double): Double {
    return 3 * (Pi() * radius * radius)
}

// Area of a Parallelogram
fun parallelogramArea(base: Double, height: Double): Double {
    return base * height
}

// Area of a Rectangle
fun rectangleArea(length: Double, width: Double): Double {
    return length * width
}

// Area of a Sphere
fun sphereArea(radius: Double): Double {
    return 4 * (Pi() * radius * radius)
}

// Area of a Square
fun squareArea(length: Double, width: Double): Double {
    return length * width
}

// Area of a Trapezium
fun trapeziumArea(baseOne: Double, baseTwo: Double, height: Double): Double {
    return (1 / 2) * (baseOne + baseTwo) * height
}

// Area of a Triangle
fun triangleArea(base: Double, height: Double): Double {
    return (1 / 2) * base * height
}
