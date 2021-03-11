package br.pro.evslopes.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked",
        //Toast.LENGTH_LONG).show()

        //Jogada do dado
        val randomInt = (1..6).random()

        //Atualização do resuldo obtido na label
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

    }
}