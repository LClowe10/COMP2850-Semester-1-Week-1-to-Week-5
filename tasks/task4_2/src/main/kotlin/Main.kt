import kotlin.system.exitProcess

// Task 4.2: use of if and range
fun main() {
    val a = "margarita"
    val b = "quattro stagioni"
    val c = "seafood"
    val d = "hawiian"

    println("PIZZA MENU")
    println("")
    println("(a) Margerita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawiian")

    print("Choose your pizza (a-d): ")

    val pizzaChoice = readln().lowercase()

    if (pizzaChoice in "a".."d") {
        println("Order Accepted")
        exitProcess(0)
    }
    else {
        println("Invalid Choice!")
        exitProcess(1)
    }

}

