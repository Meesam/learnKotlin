package com.example.learnkotlin.concept

fun main(){
    listCollection()
    setCollect()
    arrayOf()
}

fun listCollection(){
    var list = mutableListOf("Hello", "world", "data")
    println("original list $list")
    list.add("Added new data")
    println("list after added element $list")
    list.add(0,"First element")
    println("list after added element at first position $list")
    val filterList = list.filter {it:String->
        it === "Hello"
    }
    println("filter list is $filterList")

    val newList =  listOf("1","2","4")

    val addedAllList = list.addAll(newList)
    println("addedAllList is $list")
}

fun setCollect(){
    val set = mutableSetOf("1", 2, "3", "4", 2 , "1")
    println("set is $set")

    val map = mutableMapOf("hello" to 1, "dell" to 2)
    println(map.values)
}

fun arrayOf(){
    val arrayList = arrayOf(1,3,2,"d", 3)
    println(arrayList.asList().find {
        it==3
    })
}