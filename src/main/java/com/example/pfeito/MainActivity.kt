package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.pfeito.R

class MainActivity : AppCompatActivity() {

    lateinit var User : EditText
    lateinit var Pass : EditText
    lateinit var Login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        User = findViewById(R.id.edtUser)
        Pass = findViewById(R.id.edtPass)
        Login = findViewById(R.id.btnLogin)
        Login.setOnClickListener { ChamarTela() }
    }

    private fun ChamarTela() {
        var u = User.text.toString()
        var p = Pass.text.toString()

        if (u.equals("aluno") && p.equals("123456")) {
            val tela = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(tela)
            Toast.makeText(applicationContext, "LOGADO", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(applicationContext, "ERRO DE ACESSO", Toast.LENGTH_LONG).show()
            User.setText("")
            Pass.setText("")
            User.requestFocus()
        }
    }
}