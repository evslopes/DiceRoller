package br.pro.evslopes.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val redefinirButton: Button = findViewById(R.id.redefinir_button)
        redefinirButton.setOnClickListener { redefinir() }

        diceImage = findViewById(R.id.dice_image)

    }

    private fun redefinir() {
        atualizarResultado(1)
    }

    private fun rollDice(){

        mensagemToasts("Dados rolando...")
        //Jogada do dado
        val randomInt = (1..6).random()

        mensagemToasts("Seu resultado!")
        //Atualização do resuldo obtido na label
        atualizarResultado(randomInt)

    }

    private fun atualizarResultado(randomInt: Int) {

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        }


    //Funcao para exibir as msg durante as jogadas.
    private fun mensagemToasts(msg:String) {
        Toast.makeText(
            this, msg,
            Toast.LENGTH_SHORT
        ).show()
    }
}