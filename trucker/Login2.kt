package com.example.trucker
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//class login {


class Login2 : ComponentActivity() {

    // model para login
    /*class LoginViewModel : ViewModel() {
        val email = MutableLiveData<String>()
        val senha = MutableLiveData<String>()
    }

    private lateinit var loginViewModel: LoginViewModel
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // chamando o layout
        setContentView(R.layout.activity_login)

        //loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        val entrarButton = findViewById<Button>(R.id.entrarButton)

        entrarButton.setOnClickListener {
            // Lógica para processar o clique no botão de login
            val email = findViewById<EditText>(R.id.emailEditText).text.toString()
            val senha = findViewById<EditText>(R.id.senhaEditText).text.toString()

            if (senha == "123") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }


            // Adicione a lógica de autenticação aqui (integrar o banco aqui?)
            // if (autenticarUsuario(email, senha)) {
            //    // Se a autenticação for bem-sucedida, inicie a próxima atividade
            //    val intent = Intent(this, ProximaAtividade::class.java)
            //    startActivity(intent)
            // }
        }
    }
}

