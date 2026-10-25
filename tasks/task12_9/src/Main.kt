// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    val person1 = Person.create("Martha", LocalDate(2006, 10, 6))
    val person2 = Person.create("Martha", LocalDate(2006, 10, 6))
}