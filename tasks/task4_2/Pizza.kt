fun main(){
    println("A - Margherita")
    println("B - Pepperoni")
    println("C - Indian")
    println("D - Hawaiian")

   print("Enter your choice: ")
   val choice = readln().lowercase()
   if (choice.length == 1 && choice in "a".."d"){
    println("Order accepted")
   }
   else{
    println("Invalid hoice")
   }

}