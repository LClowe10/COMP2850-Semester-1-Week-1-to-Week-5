// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(2006, 10, 6)
    val person1 = Person("MarTha", date)
    println(person1.age)
}