package dev.calculate_engine.physics

// Motion of Objects

// Acceleration of Objects
fun acceleration(finalVelocity: Double, initialVelocity: Double, time: Double): Double {
    return (finalVelocity - initialVelocity) / time
}

// Momentum of Objects
fun momentum(mass: Double, velocity: Double): Double {
    return mass * velocity
}

// Speed of Objects
fun speed(distance: Double, time: Double): Double {
    return distance / time
}

// Velocity of Objects
fun velocity(speed: Double, time: Double): Double {
    return speed / time
}
