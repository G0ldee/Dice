package com.faprojects.android.diceroller

class Dice {
    var diceValue: String = "1"

    fun rollDice(): String  {
        diceValue = (1..6).shuffled().first().toString()
        return diceValue
    }
}