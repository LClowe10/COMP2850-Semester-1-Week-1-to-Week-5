// Task 7.7.1: statistics functions
package task7_7_1

fun median(list: List<Float>): Float {
    val sort = list.sorted()
    if (sort.size % 2 == 0) {
        return sort[sort.size % 2]
    }
    else {
        return (sort[sort.size % 2] + sort[(sort.size % 2) + 1]) / 2
    }
}

fun display(list: List<Float>) {
    println("The mean is ${list.average()}")
    println("The median is ${median(list)}")
    println("The Minimum is ${list.min()}")
    println("The Maximum is ${list.max()}")
}