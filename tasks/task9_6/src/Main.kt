// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import java.io.IOException
class TextException(msg: String, val line: Int) : Exception(msg)

fun main(args: Array<String>) {
    // Implement main program here
    try{
    val input = args[0]
    val x = readData(input)
    val result = variance(x)
    println(x)
    println(result)
    }
    catch(e:  NumberFormatException){
        println("Invalid number format in file")
        exitProcess(-1)
    }
    catch(e: IOException){
        println("I/O error occurred: ${e.message}")
        exitProcess(1)
    }
    catch(error:Exception){
        println("Some sort of error has occured")
        exitProcess(2)
    }
}
