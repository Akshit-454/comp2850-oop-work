// Task 7.3.1: list element access
fun main(){
    val numbers = listOf(9,3,6,2,8,5)
    //val list = listOf<Int>()
    println(numbers)
    println(numbers[0])
    println(numbers.get(0))
    //println(numbers[10])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    
    numbers.add(1)
    println(numbers)
    //println(list.first())
    //println(list.last())



}