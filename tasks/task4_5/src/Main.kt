// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: invalid number of arguments")
        exitProcess(1)
    }

    val limit = args[0].toInt()
    for (n in 1..limit step 1) {
        println(n)
    }
}
