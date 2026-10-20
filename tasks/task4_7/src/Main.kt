// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.Path
import kotlin.io.path.useLines

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: invalid number of arguments")
        exitProcess(1)
    }

    var lineNumber = 0
    var lineLength = 0
    var iter = 1
    val filePath = Path(args[0])

    filePath.useLines {
        for (line in it) {
            if (line.count() > lineLength) {
                lineLength = line.count()
                lineNumber = iter
            }
            iter++
        }
    }
    println("Line $lineNumber is longest (length = $lineLength)")
    exitProcess(0)
}
