// Task 15.2.3: SavingsAccount class
import kotlin.math.pow

class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    init {
        require(rate > 0) { "Rate must be above 0" }
    }

    fun applyInterest(years: Int = 1) {
        require(years > 0) { "Years must be above 0" }
        deposit((balance * (1 + (rate / 100)).pow(years) - balance).toInt())
    }
}