// Task 12.4.1: main program

fun main() {
    val center = Point(0.0, 0.0)
    val point = Point(1.0, 1.0)
    val circle = Circle(center, 2.0)
    println(circle.area())
    println(circle.perimeter())
    println(circle contains point)
}