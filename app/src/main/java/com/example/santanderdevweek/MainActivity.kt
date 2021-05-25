package com.example.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //DEC VARIAVEIS
        //val (value,not mutable)
        //var (variable, it's mutable)

        var contador : Int = 10
        contador = 11

        val contador2 : Int = 11

        //null security, insert '?' for not ocurrent the NullPointerException
        // with '?' do you talk the App, of the val can received the value null

        val languageName: String? = null

        //Conditiones
        var idade = 20

        if (idade > 18){
            println("Você é maior de idade")
        }else{
            println("Você é menor de idade")
        }

        val minhaIdade : String = if(idade > 18){
            "Você pe maior de idade"
        }else{
            "Você é menor de idade"
        }

        //when
        val suaIdade = when{
            idade > 18 -> "Você é maior de idade"
            else -> "Você é menor de idade"
        }

        fun qualIdade(): String{
            return "Minha idade é $idade"
        }

        fun digaIdade() : String = "Minha idade é $idade"

        val medicamento = Medicamento("Teste 1", "2x ao dia")    }
}