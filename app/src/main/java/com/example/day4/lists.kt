package com.example.day4

fun main(){
//    Immutable List -->Unchangeble After Created
//    var shoppingList = listOf("Kaar","Geedi","Ali")

//    Mutable --> changeble AFter Created

    var shoppingList = mutableListOf("Kaar","Geedi","Loor")
    shoppingList.add("Mohamed")

    println(shoppingList)
//    remove item
    shoppingList.removeAt(2)
    println(shoppingList[1])
    shoppingList[1]="Mohamed Abdulaziz"
    shoppingList.set(1,"Abdulaziz Ali kaar")
    print(shoppingList.contains("Mohamed Abdulaziz"))
//    println(shoppingList)

}