// Task 8.5: example of using a higher-order function
package task8_5

fun main() {
    // Add your testing code here
    val str1 = "finished"

    println(str1.howMany { it.lowercase() in "aeiou" })
    println(str1.count { it.lowercase() in "aeiou" })
}
