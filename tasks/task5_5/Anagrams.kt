
infix fun String.anagramOf(str:String):Boolean{

    if (this.length != str.length){
        return false
    }
    else{
        val first  = this.lowercase().toList().sorted()
        val second = str.lowercase().toList().sorted()
        return first == second
    }
}

fun main(){
    println("Enter 2 strings: ")
    val string1 = readln()
    val string2  = readln()
    if (string1 anagramOf string2) {
    println("$string1 and $string2 are anagrams!")
    }

}
