// Task 5.2.1: geometric properties of circles


import kotlin.math.PI 

fun circleArea(radius:Double) = PI *radius*radius

fun circlePerimeter(radius:Double) = 2*PI*radius

fun readDouble(prompt:String): Double {
    println(prompt)
    val input = readln().toDouble()
    return input
}
fun main(){
    val radius =  readDouble("Enter radius of circle: ")
   val area =  circleArea(radius)
    val perimeter = circlePerimeter(radius)
    println("Circles area = %.4f and Circles perimeter = %.4f".format(area,perimeter))
}