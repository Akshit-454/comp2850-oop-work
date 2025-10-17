// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics

    val List = fetchData()
    val lowest = List.minBy{it.second}
    val highest = List.maxBy{it.second}
    val average = (List.sumOf({it.second}))/List.size
    println(List)
    println(lowest)
    println(highest)
    println("Average: ${"%.2f".format(average)}")
}
