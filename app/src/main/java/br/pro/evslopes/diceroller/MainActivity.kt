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

        val redefinirButton: Button = findViewById(R.id.redefinir_button)
        redefinirButton.setOnClickListener { redefinir() }

    }

    private fun redefinir() {
        atualizarResultado(0)
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
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    //Funcao para exibir as msg durante as jogadas.
    private fun mensagemToasts(msg:String) {
        Toast.makeText(
            this, msg,
            Toast.LENGTH_SHORT
        ).show()
    }
}