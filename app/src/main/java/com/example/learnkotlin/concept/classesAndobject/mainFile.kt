package com.example.learnkotlin.concept.classesAndobject

fun main(){
   val person = Person()
   println(person.getPersonAge())
   println(person.getPersonName())
   person.printPersonNameAndAge()

   val personWithConstructer = ClassWithConstructer(name = "Tarana", age = 37)
   val personWithConstructer1 = ClassWithConstructer(name = "Tannu", age = 36)
   personWithConstructer.getPersonInfo()
   personWithConstructer1.getPersonInfo()


   println(ClassWithCompainianObject.age)

   println(ClassWithCompainianObject.salary)

  val classWithCompainianObject = ClassWithCompainianObject()
   println(classWithCompainianObject.name)
}