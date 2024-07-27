package dev.calculate_engine.physics

// Specification of Physical Objects

// Density of Objects
fun density(mass: Double, volume: Double): Double {
    return mass / volume
}

// Energy of Objects
fun energy(mass: Double, velocity: Double): Double {
    return (1 / 2) * mass * (velocity * velocity)
}

// Force of Objects
fun force(mass: Double, acceleration: Double): Double {
    return mass * acceleration
}

// Pressure of Objects
fun pressure(force: Double, acceleration: Double): Double {
    return force / acceleration
}

// Weight of Objects
fun weight(mass: Double, gravitationalAcceleration: Double): Double {
    return mass * gravitationalAcceleration
}
