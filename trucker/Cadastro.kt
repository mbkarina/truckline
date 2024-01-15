package com.example.trucker

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


//class CadastroViewModel : ViewModel() {
    class CadastroActivity : AppCompatActivity() {


        private lateinit var cadastroViewModel: modelCadastro

        @SuppressLint("WrongViewCast", "MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            // adicionando o layout
            setContentView(R.layout.activity_cadastro)

            //cadastroViewModel = ViewModelProvider(this).get(modelCadastro::class.java)

            // criando as variáveis dos items colocados no xml
            val nomeEditText = findViewById<EditText>(R.id.nomeEditText)
            val emailEditText = findViewById<EditText>(R.id.emailEditText)
            val senhaEditText = findViewById<EditText>(R.id.senhaEditText)
            val cadastrarButton = findViewById<Button>(R.id.cadastrarButton)

            // tentei criar uma classe para juntar tudo no botão de cadastrar para mandar ao banco
            // de dados, mas tá dando erro
            cadastrarButton.setOnClickListener {
                val nome = nomeEditText.toString()
                val email = emailEditText.text.toString()
                val senha = senhaEditText.text.toString()

                val Usuario = modelCadastro.Usuario(nome, email, senha)

            }
        }

}



