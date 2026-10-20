// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Validation for the number of arguments provided
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
        }
    // Values provided from the command line and conversion from a String to a Float
    val sideA = args[0].toFloat()
    val sideB = args[1].toFloat()
    val sideC = args[2].toFloat()
    val semiPerimeter = ((0.5) * (sideA + sideB + sideC))
    // Heron's Formula
    val area = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
    // Final print line
    println("Area = %.5f".format(area))
}