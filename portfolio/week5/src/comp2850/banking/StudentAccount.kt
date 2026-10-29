// COMP2850 Portfolio: Week 5
// StudentAccount class

package comp2850.banking

const val MAX_OVERDRAFT = 100
const val MIN_OVERDRAFT = 0

class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft = 0
        set(value) {
            require(value in MIN_OVERDRAFT..MAX_OVERDRAFT)
            field = value 
        }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(amount <= (balance + overdraft)) { "Insufficient funds for withdrawal" }
        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean {
        return (balance > -overdraft)
    }

    override fun toString(): String = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}