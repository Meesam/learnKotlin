package com.example.learnkotlin.concept.classesAndobject

class Person {
  private var personName:String = ""
  private var personAge:Int=0


  fun getPersonName():String{
      personName = "Meesam"
      return personName
  }

  fun getPersonAge():Int{
      personAge = 38
      return personAge
  }

  fun printPersonNameAndAge(){
      println("Person name is $personName and person age is $personAge" )
  }

}