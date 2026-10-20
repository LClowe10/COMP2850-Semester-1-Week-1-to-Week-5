// Task 5.2.1: main program
package task5_2_1
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: invalid number of arguments")
        exitProcess(1)
    }
    val radius = args[0].toDouble()
    val circArea = circleArea(radius)
    val circPerim = circlePerimeter(radius)

    println("The area of a circle with radius ${"%.4f".format(radius)} is ${"%.4f".format(circArea)}")
    println("The perimeter of a circle with radius ${"%.4f".format(radius)} is ${"%.4f".format(circPerim)}")
    exitProcess(0)
}