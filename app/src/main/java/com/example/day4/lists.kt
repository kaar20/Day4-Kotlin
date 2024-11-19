package com.example.day4

fun main(){
//    Immutable List -->Unchangeble After Created
//    var shoppingList = listOf("Kaar","Geedi","Ali")

//    Mutable --> changeble AFter Created

    var shoppingList = mutableListOf("Kaar","Geedi","Loor")
    shoppingList.add("Mohamed")

//    println(shoppingList)
//    remove item
    shoppingList.removeAt(2)
//    println(shoppingList[1])
//    shoppingList[1]="Mohamed Abdulaziz"
//    shoppingList.set(1,"Abdulaziz Ali kaar")
//    print(shoppingList.contains("Mohamed Abdulaziz"))
//    println(shoppingList)
    // For Loops
//    println("********************** LOOPS ********************")
//    for (item in shoppingList)
//    {
//        println(item)
//        if (item.contains("Kaar")){
//            println("Found the wanted item")
//            break
//        }
//
//    }
//    for(index in 0 until shoppingList.size)
//    {
//        println("Index $index have value of ${shoppingList[index]}")
//    }

    var mohamedAccount = BankAccount("Mohamed Abdiaziz",12000.10)
    println("Your Bank Balance is \$${mohamedAccount.acctBalance()}")
    mohamedAccount.deposit(1200.2)
    mohamedAccount.deposit(16666.0)
    println("${mohamedAccount.accountHolder}'s balance is $${mohamedAccount.acctBalance()}")
    mohamedAccount.withDraw(120.0)
    mohamedAccount.withDraw(1280.88)
    println("${mohamedAccount.accountHolder}'s balance is $${mohamedAccount.acctBalance()}")
//   var Balance= mohamedAccount.acctBalance()
//    println(Balance)\


    println("**************** NEW Bank Account************")
    var Sarah= BankAccount("Sarah",0.0)
    Sarah.deposit(100.0)
//    println("${Sarah.accountHolder}'s balance is $${Sarah.acctBalance()}")
    Sarah.withDraw(10.0)
//    println("${Sarah.accountHolder}'s balance is $${Sarah.acctBalance()}")
    Sarah.deposit(300.0)
    Sarah.DisplayTransactionHistory()
    println("${Sarah.accountHolder}'s balance is $${Sarah.acctBalance()}")



}