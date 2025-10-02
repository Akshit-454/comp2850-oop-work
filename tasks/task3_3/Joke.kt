fun main(){
print("Enter your name: ")
val name = readln()

println("Hello $name!")
println("Your name contains ${name.length} characters")
println("Is it a short name? ${name.length < 5}")
println("Uppercase name is ${name.uppercase()}")
}