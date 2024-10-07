package com.example.learnkotlin.concept.scopeFunction

fun main(){
    getPersonInfo()
}

fun getPersonInfo(){
    val person = Person();

     person.run {
       name = "Meesam"
       age = 17
       salary = 1000
     }

    person.name?.let {
        println("person name length is ${person.name!!.length}")
    }
}