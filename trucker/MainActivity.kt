package com.example.trucker
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            // chamando o layout
            setContentView(R.layout.tela_activity)

            // criando as variáveis dos items colocados no xml
            val imageButton = findViewById<ImageButton>(R.id.imageButton)
            val pname = findViewById<TextView>(R.id.editTextText)


            imageButton.setOnClickListener(){
                val intent = Intent(this,TelaPerfil::class.java)
                startActivity(intent)
            }

            val nome = "teste"
            pname.text = "Olá, $nome!"

        }

           // val imageView = findViewById<ImageView>(R.id.imagem)

}





