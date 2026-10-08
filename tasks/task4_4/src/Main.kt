// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign.*
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal
import com.github.ajalt.mordant.rendering.TextStyles.*

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Error: invalid number of arguments")
        exitProcess(1)
    }

    val t = Terminal()
    var currentTempC = args[0].toFloat()
    val inc = args[1].toFloat()
    val maxTemp = args[2].toFloat()

        t.println(table {
            align = RIGHT
            header {
                style = brightGreen + bold
                row("Celsius", "Farinheit")
            }
            body {
                while (currentTempC < maxTemp) {
                    var currentTempF = (currentTempC * (9 / 5)) + 32
                    row("${String.format("%.1f", currentTempC)}", "${String.format("%.1f", currentTempF)}")
                    currentTempC = currentTempC + inc
                }
            }
        })
    exitProcess(0)


}
