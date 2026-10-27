// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    val perimeter: Double = (sideA + sideB + sideC)
    val semiPerimeter: Double = ((0.5) * (sideA + sideB + sideC))
    val area = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    init {
        require(sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) { "Invalid Triangle" }
    }

    override fun toString() = "Triangle(%.1f, %.1f, %.1f)".format(sideA, sideB, sideC)
}