// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    try {
        if(args.size == 1) {
            println(variance(readData(args[0])))
        }
        exitProcess(0)
    }
    catch(error: IllegalArgumentException) {
        println("Invalid Filename")
        exitProcess(1)
    }
    catch(error: Exception) {
        println("Some error occured")
        exitProcess(1)
    }
    exitProcess(0)
}
