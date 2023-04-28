package com.faprojects.android.diceroller

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

val TAG = "DICEVIEWMODEL"
class DiceViewModel(dice: Dice) : BaseObservable() {

    var dice = Dice()

        set(dice) {
            field = dice
            notifyChange()
        }

    @get: Bindable
    val title: String
        get() = dice.diceValue


    fun onClickRoll() {
        dice.rollDice()
        Log.d(TAG, dice.diceValue)
        notifyChange()
    }

}

