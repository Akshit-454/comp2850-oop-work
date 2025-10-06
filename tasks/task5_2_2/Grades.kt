// Task 5.2.2: conversion of marks into grades, using a function


fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}
fun main(args: Array<String>){
    for(i in args){
        val mark = i.toInt()
        val report  = grade(mark)    
        println("$i is a $report")
    }
}