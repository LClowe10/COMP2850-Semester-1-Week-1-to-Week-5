// Task 5.2.2: conversion of marks into grades, using a function
import kotlin.system.exitProcess

fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    if (args.size < 1) {
        println("Error: invalid number of arguments")
        exitProcess(1)
    }
    for (marks in args) {
        var mark = marks.toInt()
        var grade = grade(mark)
        println("$mark with a grade of $grade")
    }

}