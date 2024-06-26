package dev.hyaena_technologies.calculate_engine.logic.math.geometry

import dev.hyaena_technologies.calculate_engine.logic.math.constant.Pi

// Area of Objects

// Area of a Circle
fun CircleArea(radius: Double): Double {
    return Pi() * (radius * radius)
}

// Area of a Cube
fun CubeArea(length: Double, width: Double): Double {
    return 6 * (length * width)
}

// Area of a Cylinder
fun CylinderArea(height: Double, radius: Double): Double {
    return (2 * height * Pi() * radius) + (2 * Pi() * radius * radius)
}

// Area of a Hemisphere
fun HemisphereArea(radius: Double): Double {
    return 3 * (Pi() * radius * radius)
}

// Area of a Parallelogram
fun ParallelogramArea(base: Double, height: Double): Double {
    return base * height
}

// Area of a Rectangle
fun RectangleArea(length: Double, width: Double): Double {
    return length * width
}

// Area of a Sphere
fun SphereArea(radius: Double): Double {
    return 4 * (Pi() * radius * radius)
}

// Area of a Square
fun SquareArea(length: Double, width: Double): Double {
    return length * width
}

// Area of a Trapezium
fun TrapeziumArea(baseOne: Double, baseTwo: Double, height: Double): Double {
    return (1 / 2) * (baseOne + baseTwo) * height
}

// Area of a Triangle
fun TriangleArea(base: Double, height: Double): Double {
    return (1 / 2) * base * height
}
