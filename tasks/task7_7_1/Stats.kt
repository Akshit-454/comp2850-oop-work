// Task 7.7.1: stats for a numeric dataset

fun readData()= buildList{
    println("Enter floating data-values and Press q to exit:  ")
   
    while (true){
        val input = readln()
        if (input == "q" || input == "Q"){
            break
        }
        else{
            val num = input.toFloat()
            add(num)
        }
    }
}

fun median(list: List<Float>):Float{
    if (list.isEmpty()){
        println("List is empty")
    }
    val size_list = list.size
    val sorted = list.sorted()
    var median_ans = 0.0f
    if (size_list%2==0){
         median_ans = (sorted[(size_list/2)]+sorted[(size_list/2)-1])/2
    }
    else {
         median_ans = sorted[(size_list)/2]
    }
    return median_ans
    //println("Median of floating point values = $median_ans ")

}
fun display(list:List<Float>){
    val median = median(list)
    val average = list.average()
    val min = list.min()
    val max = list.max()
    println("Stats: \nMedian = $median \nMean = $average \nMin = $min \nMax = $max \n")
}
fun main(){
    val List  = readData()
    display(List)
}
