// Task 5.1.1: anagram checking using a function

fun anagrams(str1:String  , str2:String):Boolean{
    if (str1.length != str2.length){
        return false
    }
    else{
        val first  = str1.lowercase().toList().sorted()
        val second = str2.lowercase().toList().sorted()
        return first == second
    }
}

fun main(){
    println("Enter 2 strings: ")
    val string1 = readln()
    val string2  = readln()
    println(anagrams(string1,string2))
}