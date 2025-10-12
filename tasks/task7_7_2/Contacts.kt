// Task 7.7.2: contact database, using a map
val dataMap = mutableMapOf("Akshit" to "+91 8056117918" , "Saakshi" to "+91 638219937")

fun Database(name: String){
    if (name in dataMap.keys){

        println("$name : ${dataMap[name]}")
    }
    else {
        println("Person Not Found")
        println("Enter person's number to store: ")
        val number = readln()
        dataMap[name] = number
    }
}
fun main(){
    println("Connecting database... ")
    while(true){
        println("Please enter Person name and enter z to exit : ")
        val input = readln()
        if (input=="z"||input=="Z"){
            break
        }
        else {
            Database(input)
        }
    }
}

