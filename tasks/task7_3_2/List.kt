fun main(){
    val numbers = mutableListOf(9,3,6,2,22,8,2,5)
    println(numbers)
    println(numbers[0])
    println(numbers.get(0))
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers[0]=100
    println(numbers)
    numbers.add(1)
    println(numbers)
    numbers.addAll(setOf(200,300))
    println(numbers)
    numbers.remove(2)
    println(numbers)
     numbers.removeAll{it == 2}
    println(numbers)
    numbers.removeAt(2)
    println(numbers)
    numbers.clear()
    println(numbers)
}