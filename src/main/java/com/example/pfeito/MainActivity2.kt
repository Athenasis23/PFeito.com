package com.example.app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pfeito.R

class MainActivity2 : AppCompatActivity() {

    lateinit var proximatela1 : Button
    lateinit var proximatela2 : Button
    lateinit var proximatela3 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        proximatela1 = findViewById(R.id.btnRestaurante)
        proximatela1.setOnClickListener { Tela3() }

        proximatela2 = findViewById(R.id.btnCafe)
        proximatela2.setOnClickListener { Tela4() }

        proximatela3 = findViewById(R.id.btnAlmoco)
        proximatela3.setOnClickListener { Tela5() }
    }

    private fun Tela3(){
        val telaActivity3 = Intent(this@MainActivity2,MainActivity3::class.java)
        startActivity(telaActivity3)
    }

    private fun Tela4(){
        val telaActivity4 = Intent(this@MainActivity2,MainActivity4::class.java)
        startActivity(telaActivity4)
    }

    private fun Tela5(){
        val telaActivity5 = Intent(this@MainActivity2,MainActivity5::class.java)
        startActivity(telaActivity5)
    }
}