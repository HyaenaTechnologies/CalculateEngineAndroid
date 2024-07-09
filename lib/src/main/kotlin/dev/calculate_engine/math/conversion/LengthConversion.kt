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

// Decameter Conversion
fun decameterConversion() {
    val decameterConversionMap: Map<String, Double> = mapOf(
        "Centimeters" to 0.001,
        "Decimeters" to 0.01,
        "Feet" to 0.03048,
        "Hectometers" to 10.0,
        "Inches" to 0.00254,
        "Kilometers" to 100.0,
        "Meters" to 0.1,
        "Micrometers" to 0.0000001,
        "Miles" to 160.9344,
        "Millimeters" to 0.0001,
        "Nanometers" to 0.0000000001,
        "Nautical Miles" to 185.2001,
        "Picometers" to 0.0000000000001,
        "Yards" to 0.09144
    )
}

// Decimeter Conversion
fun decimeterConversion() {
    val decimeterConversionMap: Map<String, Double> = mapOf(
        "Centimeters" to 0.1,
        "Decameters" to 100.0,
        "Feet" to 3.048,
        "Hectometers" to 1000.0,
        "Inches" to 0.254,
        "Kilometers" to 10000.0,
        "Meters" to 10.0,
        "Micrometers" to 0.00001,
        "Miles" to 16093.44,
        "Millimeters" to 0.01,
        "Nanometers" to 0.00000001,
        "Nautical Miles" to 18520.01,
        "Picometers" to 0.00000000001,
        "Yards" to 9.144
    )
}

// Feet Conversion
fun feetConversion() {
    val feetConversionMap: Map<String, Double> = mapOf(
        "Centimeters" to 0.0328084,
        "Decameters" to 32.8084,
        "Decimeters" to 0.328084,
        "Hectometers" to 328.084,
        "Inches" to 0.08333333,
        "Kilometers" to 3280.84,
        "Meters" to 3.28084,
        "Micrometers" to 0.00000328084,
        "Miles" to 5280.0,
        "Millimeters" to 0.00328084,
        "Nanometers" to 0.00000000328084,
        "Nautical Miles" to 6076.118,
        "Picometers" to 0.00000000000328084,
        "Yards" to 3.0
    )
}

// Hectometer Conversion
fun hectometerConversion() {
    val hectometerConversionMap: Map<String, Double> = mapOf(
        "Centimeters" to 0.0001,
        "Decameters" to 0.1,
        "Decimeters" to 0.001,
        "Feet" to 0.003048,
        "Inches" to 0.000254,
        "Kilometers" to 10.0,
        "Meters" to 0.01,
        "Micrometers" to 0.00000001,
        "Miles" to 16.09344,
        "Millimeters" to 0.00001,
        "Nanometers" to 0.00000000001,
        "Nautical Miles" to 18.52001,
        "Picometers" to 0.00000000000001,
        "Yards" to 0.009144
    )
}