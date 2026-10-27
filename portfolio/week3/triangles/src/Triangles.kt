// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    // For loop to loop through the differenet possibilities of sides
    val sideA = triangle.first
    val sideB = triangle.second
    val sideC = triangle.third
    // Boolean statment for the check
    if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
        return true
    }
    return false
}

fun triangleArea(triangle: Triangle): Double {
    // Values provided from the command line and conversion from a String to a Float
    if (!isValidTriangle(triangle)) {
        throw IllegalArgumentException("Not a Valid Triangle!")
    }
    
    val sideA = triangle.first.toFloat()
    val sideB = triangle.second.toFloat()
    val sideC = triangle.third.toFloat()
    val semiPerimeter = ((0.5) * (sideA + sideB + sideC))
    // Heron's Formula
    val area = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    return area
}