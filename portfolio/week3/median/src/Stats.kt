// Task 7.7.1: statistics functions

fun median(list: List<Float>): Float {
    if (list.size < 1) {
        throw IllegalArgumentException("Empty List!")
    }

    val sort = list.sorted()
    val n = sort.size

    if (n % 2 != 0) {
        return sort[n / 2]
    }
    else {
        return (sort[n / 2] + sort[(n / 2) - 1]) / 2
    }
}

fun display(list: List<Float>) {
    println("The mean is ${list.average()}")
    println("The median is ${median(list)}")
    println("The Minimum is ${list.min()}")
    println("The Maximum is ${list.max()}")
}