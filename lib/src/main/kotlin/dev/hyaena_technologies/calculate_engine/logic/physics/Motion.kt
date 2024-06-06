package dev.hyaena_technologies.calculate_engine.logic.physics


// Motion of Objects
class Motion {
    // Acceleration of Objects
    fun Acceleration(finalVelocity: Double, initialVelocity: Double, time: Double): Double {
        return (finalVelocity - initialVelocity) / time
    }

    // Momentum of Objects
    fun Momentum(mass: Double, velocity: Double): Double {
        return mass * velocity
    }

    // Speed of Objects
    fun Speed(distance: Double, time: Double): Double {
        return distance / time
    }

    // Velocity of Objects
    fun Velocity(speed: Double, time: Double): Double {
        return speed / time
    }
}