// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val center: Point, val radius: Double) {
    init {
        require(radius > 0) { "radius must be greater than 0" }
    }
    fun area() = PI * radius * radius
    fun perimeter() = PI * 2 * radius
    infix fun contains(point: Point): Boolean {
        return (point.distanceTo(center) <= radius)
    }
}