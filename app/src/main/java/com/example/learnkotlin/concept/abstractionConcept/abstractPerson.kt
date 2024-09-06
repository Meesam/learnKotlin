package com.example.learnkotlin.concept.abstractionConcept

abstract class AbstractPerson {
  abstract val name:String

  abstract fun getPersonName():String

  abstract fun getPersonAge(age:Int):Int

  fun sayHello():String{
      return  "Hello"
  }

}