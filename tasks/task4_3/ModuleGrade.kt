import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3){
        println("ERROR: Please give 3 module marks only")
        exitProcess(1)
    }
    val mark1 = args[0].toInt()
    val mark2 = args[1].toInt()
    val mark3 = args[2].toInt()

    if (!(mark1 in 0..100 && mark2 in 0..100 && mark3 in 0..100)){
        println("ERROR: Please give 'PROPER' module marks")
        exitProcess(1)
    }
    val average = ((mark1 + mark2 + mark3)/3.0) //use .toInt() only if u dont wqant final answer in decimal
    val rounded_average = average.roundToInt()
    val grade = when (rounded_average){
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "Information not given"
    }
    println("Rounded Average mark = $rounded_average")
    println("Grade = $grade")
    
}