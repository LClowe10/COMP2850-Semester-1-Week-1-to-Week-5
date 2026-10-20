// Task 8.3: weather station temperature analysis program
package task8_3
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val fetched = fetchData(args[0])
    val low = fetched.minBy { it.second }
    val high = fetched.maxBy { it.second }
    val average = fetched.map { it.second }.average()

    println("The min temp was ${low.second}C at ${low.first}")
    println("The max temp was ${high.second}C at ${high.first}")
    println("The average temp was %.2f C".format(average))

}
