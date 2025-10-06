
val  String.tooLong : Boolean get() = this.length > 20

fun main(){
    println("Enter a string to check: ")
    val input = readln()
    println(input.tooLong)
}
