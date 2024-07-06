package dev.calculate_engine.math.conversion

// Length Units
val lengthUnits: Array<String> = arrayOf(
    "Astronomical Unit",
    "Centimeter",
    "Decameter",
    "Decimeter",
    "Feet",
    "Hectometer",
    "Inch",
    "Kilometer",
    "Light Year",
    "Meter",
    "Micrometer",
    "Mile",
    "Millimeter",
    "Nanometer",
    "Nautical Mile",
    "Parsec",
    "Picometer",
    "Yard"
)

// Centimeter Conversion
fun centimeterConversion() {
    val centimeterConversionMap: Map<String, Double> = mapOf(
        "Decameters" to 1000.0,
        "Decimeters" to 10.0,
        "Feet" to 30.48,
        "Hectometers" to 10000.0,
        "Inches" to 2.54,
        "Kilometers" to 100000.0,
        "Meters" to 100.0,
        "Micrometers" to 0.0001,
        "Miles" to 160934.4,
        "Millimeters" to 0.1,
        "Nanometers" to 0.0000001,
        "Nautical Miles" to 185200.1,
        "Picometers" to 0.0000000001,
        "Yards" to 91.44
    )
}