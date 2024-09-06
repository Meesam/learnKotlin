package com.example.learnkotlin.concept.abstractionConcept

class Person() : AbstractPerson() {
    override val name: String = "Meesam"

    override fun getPersonName(): String {
        return  name
    }

    override fun getPersonAge(age: Int): Int {
        return age
    }

}