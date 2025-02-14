package br.pro.evslopes.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val redefinirButton: Button = findViewById(R.id.redefinir_button)
        redefinirButton.setOnClickListener { redefinir() }

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

    }

    private fun redefinir() {
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }

    private fun rollDice(){

        mensagemToasts("Dados rolando...")
        //Jogada do dado

        mensagemToasts("Seu resultado!")
        //Atualização do resuldo obtido na label

        diceImage.setImageResource(atualizarResultado())
        diceImage2.setImageResource(atualizarResultado())


    }

    private fun atualizarResultado(): Int {

        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

    }


    //Funcao para exibir as msg durante as jogadas.
    private fun mensagemToasts(msg:String) {
        Toast.makeText(
            this, msg,
            Toast.LENGTH_SHORT
        ).show()
    }
}