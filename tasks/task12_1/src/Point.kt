// Task 12.1: Point class

import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(x2: Double, y2: Double): Double = hypot((x2 - x), (y2 - y))

}