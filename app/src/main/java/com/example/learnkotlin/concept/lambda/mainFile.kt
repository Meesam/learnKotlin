package com.example.learnkotlin.concept.lambda

fun main(){
  println(add(1,2))
  println(addLambda(3,5))
}



// lambda

val addLambda : (Int,Int) -> Int = {a,b -> a + b}

// normal function
fun add(a:Int, b:Int):Int {
    return a + b
}