import kotlin.random.Random

fun rollDie(sides:Int = 6){
    if (sides in setOf(4,6,8,10,12,20)){
        println("Rolling a d$sides...")
        val result = Random.nextInt(1,sides+1)
        println("You rolled a $result")
    }
    else{
        println("ERROR : cannot have a $sides sided dice ")
    }
}
fun main(){
    rollDie(10)
}