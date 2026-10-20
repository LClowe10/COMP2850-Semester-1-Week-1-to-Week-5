// Task 5.1.1: main program
package utils
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: invalid number of arguments")
        exitProcess(1)
    }
    var isAna = anagrams(args[0], args[1])
    if (isAna) {
        println("${args[0]} and ${args[1]} are an anagram!")
    }
    else {
        println("${args[0]} and ${args[1]} are an anagram!")
    }
    exitProcess(0)
}