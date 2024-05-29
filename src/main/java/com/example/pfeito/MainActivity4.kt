package com.example.app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pfeito.R

class MainActivity4 : AppCompatActivity() {

    lateinit var voltartela2 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        voltartela2 = findViewById(R.id.btnVoltar1)
        voltartela2.setOnClickListener { Tela2() }
    }

    private fun Tela2(){
        val telaActivity2 = Intent(this@MainActivity4,MainActivity2::class.java)
        startActivity(telaActivity2)
    }

}