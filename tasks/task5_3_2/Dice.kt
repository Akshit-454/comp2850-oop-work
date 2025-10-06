// Task 5.3.2: dice rolling simulation

import kotlin.random.Random

fun rollDie(sides:Int = 6 ,  numDice:Int = 1){
    if (sides in setOf(4,6,8,10,12,20)){
        println("Rolling a d$sides...")
        var sum = 0
        for(i in 1..numDice){
            val result = Random.nextInt(1,sides+1)
            sum = sum +result
        }
        println("Your total score of $numDice of $sides sides =  $sum")
    }
    else{
        println("ERROR : cannot have a $sides sided dice ")
    }
}
fun main(){
    rollDie()
    rollDie(8)
    rollDie(6,3)
    rollDie(numDice=10 , sides =4)
}