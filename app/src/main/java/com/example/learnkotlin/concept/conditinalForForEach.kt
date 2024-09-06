package com.example.learnkotlin.concept

fun main(){
    println("This is main function")
    conditionConcept()
    switchConcept(day = "Sunday")
    switchConcept(day = "Monday")
    forLoopConcept()
    forEachConcept()
}

fun conditionConcept(){
    val num= 20
    if(num < 20)
        println("Number is less then 20")
    else
        println("Number is 20 or greater")
}

fun switchConcept(day:String){
    when(day){
        "Monday" -> println("This is monday")
        "Tuesday" -> println("This is tuesday")
        "Wednesday" -> println("This is wednesday")
        else -> println("Day not match")
    }
}

fun forLoopConcept(){
    for (i in 1..5){
        println("Number is $i")
    }
}

fun forEachConcept(){
    val list = listOf("Hello", "world")
    list.forEach{ it:String->
        println("value is $it")
    }
}