# Task 5.3.1

Copy your solution to Task 5.1.2 into this directory and modify it.

You will need to give the `sides` parameter of `rollDice()` a default
value of 6.

You will also need to change `main()` so that it demonstrates the use of
the default value.
import kotlin.random.Random

fun rollDie(sides:Int){
    if (sides in setOf(4,6,8,10,12,20)){
        println("Rolling a d$sides...")
        val result = Random.nextInt(1,sides+1)
        println("You rolled a $result")
    }
    else{
        println("ERROR : cannot have a $sides sided dice ")
    }
}
fun readInt(prompt:String):Int{
    println(prompt)
    val input = readln()
    val num = input.toInt()
    return num
    }
fun main(){
   val die = readInt("Enter the number of die_sides")
    rollDie(die)
}