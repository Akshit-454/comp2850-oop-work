// Task 5.4.1: string extension function

fun String.tooLong() = this.length > 20

fun main(){
    println("Enter a string to check: ")
    val input = readln()
    println(input.tooLong())
}