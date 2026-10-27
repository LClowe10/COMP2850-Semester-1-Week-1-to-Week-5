// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int) {
    if (euros < 0 || 100 < cents < 0 ) {
        throw IllegalArgumentException("Invalid Amount")
    }
    operator fun plus(other: Money) = Money(euros + other.euros + cents + other.cents / 100, cents + other.cents % 100)
}