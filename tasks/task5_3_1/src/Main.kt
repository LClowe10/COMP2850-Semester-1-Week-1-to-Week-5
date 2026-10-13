
import kotlin.random.Random
import kotlin.system.exitProcess

fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main(args: Array<String>) {

    rollDie()
    rollDie()
    rollDie()
    exitProcess(0)
}