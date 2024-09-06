package com.example.learnkotlin.concept.interfaceConcept

class Person:IPerson {
    val name:String = "Meesam"

    override fun getPersonName(): String {
        return name
    }

    override fun getPersonAge(age:Int): Int {
        return age
    }

}