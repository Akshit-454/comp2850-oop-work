import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3){
        println("ERROR: Please give 3 module marks")
        exitProcess(1)
    }
    val mark1 = args[0].toInt()
    val mark2 = args[1].toInt()
    val mark3 = args[2].toInt()
    val average = round((mark1 + mark2 + mark3)/3.0).toInt() //use .toInt() only if u dont wqant final answer in decimal

    val grade = when (average){
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
    }
    println("Average mark = $average")
    println("Grade = $grade")
    
}