

// Task 4.3: grade calculation using a when expression


fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: invalid number of arguments")
        exitProcess(1)
    }

    val average = (args[0].toInt() + args[1].toInt() + args[2].toInt()) / 3

    when (average) {
        in 0..39   -> println("Grade: Fail @ Mark:$average")
        in 40..69  -> println("Grade: Pass @ Mark:$average")
        in 70..100 -> println("Grade: Distinction @ Mark:$average")
        else       -> println("?")
    }
    exitProcess(0)
}