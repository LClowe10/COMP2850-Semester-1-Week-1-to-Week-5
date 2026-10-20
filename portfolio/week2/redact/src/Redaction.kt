// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(input: String, redaction:String, character:Char = 'X'): String {
    // Finds and replaces the whole string redaction in the input with the characters of the same length
    return input.replace(redaction, character.toString().repeat(redaction.length))
}