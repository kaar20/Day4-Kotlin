package com.example.day4

class BankAccount(var accountHolder:String,var balance:Double) {

    private val transactionHistory= mutableListOf<String>()

    fun deposit(amount:Double)
    {
        balance +=amount
        transactionHistory.add("$accountHolder Deposited $$amount")

    }

    fun withDraw(amount:Double){
        if (amount <= balance)
        {
            balance-=amount
            transactionHistory.add("$accountHolder Withdrew $$amount")
        }else{
            println("Issuficient Balance")

        }

    }
    fun DisplayTransactionHistory(){
        for (history in transactionHistory)
        {
            println(history)
        }

    }

    fun acctBalance():Double{
        return balance
    }

}