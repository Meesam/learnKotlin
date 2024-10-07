package com.example.learnkotlin.concept.highOrderFunction

fun main(){
   highOrderFunction(printMe)
   println(highOrderAddFunction(addMe))
}

val printMe = { println("Print me !!")}

val addMe : (Int,Int) -> Int = {a,b -> a + b}

fun highOrderFunction(func : ()->Unit){
    func()
}

fun highOrderAddFunction(func:(Int ,Int)->Int):Int{
    return func(3,4)
}