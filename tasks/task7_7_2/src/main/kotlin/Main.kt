// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val database = createDatabase()
    database.load(CSV_FILENAME)

    while(true) {
        println("Enter a contact name or q to quit")
        var contactName = readln()

        if (contactName == "q") {
            break
        }

        if (database.containsKey(contactName)) {
            println("$contactName has number ${database[contactName]}")
        }

        else {
            println("Not a contact, add a phone number to add to the list")
            var number = readln()
            database[contactName]  = number
            database.save(CSV_FILENAME)
        }
    }
}
