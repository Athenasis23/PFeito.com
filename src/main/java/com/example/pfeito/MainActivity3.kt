package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pfeito.R

class MainActivity3 : AppCompatActivity() {

    lateinit var voltartela2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        voltartela2 = findViewById(R.id.btnVoltar1)
        voltartela2.setOnClickListener { Tela2() }
    }

    private fun Tela2(){
        val telaActivity2 = Intent(this@MainActivity3,MainActivity2::class.java)
        startActivity(telaActivity2)
    }

}