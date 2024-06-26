package dev.hyaena_technologies.calculate_engine.logic.physics

// Specfication of Physical Objects

// Density of Objects
fun Density(mass: Double, volume: Double): Double {
    return mass / volume
}

// Energy of Objects
fun Energy(mass: Double, velocity: Double): Double {
    return (1 / 2) * mass * (velocity * velocity)
}

// Force of Objects
fun Force(mass: Double, acceleration: Double): Double {
    return mass * acceleration
}

// Pressure of Objects
fun Pressure(force: Double, acceleration: Double): Double {
    return force / acceleration
}

// Weight of Objects
fun Weight(mass: Double, gravitationalAcceleration: Double): Double {
    return mass * gravitationalAcceleration
}
