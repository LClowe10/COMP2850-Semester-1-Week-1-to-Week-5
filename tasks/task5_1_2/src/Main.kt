// Task 5.1.2: main program
package task5_1_2
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: invalid number of arguments")
        exitProcess(1)
    }
    rollDie(args[0].toInt())
    rollDie(args[1].toInt())
    rollDie(args[2].toInt())
    exitProcess(0)
}