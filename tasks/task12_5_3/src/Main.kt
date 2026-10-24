// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(2006, 10, 6)
    val name = ""
    val person1 = Person(name, date)
    println(person1.name)
}