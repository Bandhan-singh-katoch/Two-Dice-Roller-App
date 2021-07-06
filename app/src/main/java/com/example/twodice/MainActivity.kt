package com.example.twodice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rolldice() }
        rolldice()


    }

private fun rolldice() {
    val dice = Dice(6)
    val diceRoll = dice.roll()
    val diceImage : ImageView = findViewById(R.id.imageView)

    val drawableResource = when(diceRoll) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    diceImage.setImageResource(drawableResource)


    val dice1 = Dice(6)
    val diceRoll1 = dice1.roll()
    val diceImage1 : ImageView = findViewById(R.id.imageView3)

    val drawableResource1 = when(diceRoll1) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    diceImage1.setImageResource(drawableResource1)
}


}

class Dice(private val numSides : Int) {

   fun roll():Int {
       return (1..numSides).random()
   }

}