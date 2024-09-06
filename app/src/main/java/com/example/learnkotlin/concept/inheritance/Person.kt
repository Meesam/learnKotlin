package com.example.learnkotlin.concept.inheritance

open class Person {
  var name = ""
  open var age = 30
  fun getPersonInfo(name:String):String{
      return name;
  }

 open fun getPersonAge():Int{
      return age;
  }
}

class Male :Person(){

    // Overriding property
    override var age = 38

    // Method over riding
    override fun getPersonAge(): Int {
        return age + 10
    }
}