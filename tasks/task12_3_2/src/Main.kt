// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val date = "2007-04-17"
    val person1 = Person("Vishnu", date)
    println("${person1.name} ${person1.birth} ${person1.isMarried}")
}