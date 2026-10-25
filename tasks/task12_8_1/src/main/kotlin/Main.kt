// Task 12.8.1: demo program for Day enum class

fun main() {
    println("Enter a day of the week: ")
    val dayString = readln().lowercase().replaceFirstChar { it.uppercase() }
    try {
        val day = Day.valueOf(dayString)
        println(day)
    }
    catch (error: Exception) {
        println("Invalid Day")
    }
}