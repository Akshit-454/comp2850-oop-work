
fun String.howMany(include:(Char)-> Boolean):Int{
    var count = 0
    for (char in this){
        if(include(char)){
            count+=1
        }
    }
    return count
}

fun main(){
    val string = "akshit"
    val num = string.howMany{it == 'a'}
    println(num)
}