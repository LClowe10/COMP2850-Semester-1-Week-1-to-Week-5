// Task 12.1: Point class

import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(x2, y2) = hypot((x2 - x) * (x2 - x), (y2 - y) * (y2 - y))

}