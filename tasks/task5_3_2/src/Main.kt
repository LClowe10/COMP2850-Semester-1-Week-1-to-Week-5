// Task 5.3.2: main program
package task5_3_2
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var dice = args[0].substringBefore("d").toInt()
    var sides = args[0].substringAfter("d").toInt()

    rollDice(sides, dice)
    exitProcess(0)
}