Copy the source files from Task 5.1.2 here!

import kotlin.random.Random
import kotlin.system.exitProcess

fun rollDie(sides: Int) {
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
  if (args.size != 3) {
    println("Error: invalid number of arguments")
    exitProcess(1)
  }
  var roll1 = rollDie(args[0].toInt())
  var roll2 = rollDie(args[1].toInt())
  var roll3 = rollDie(args[2].toInt())
  exitProcess(0)
}