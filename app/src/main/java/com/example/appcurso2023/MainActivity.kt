package com.example.appcurso2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStar = findViewById<AppCompatButton>(R.id.btnP)
        val edittextname = findViewById<AppCompatEditText>(R.id.etname)
        var name:String = ""


        btnStar.setOnClickListener{
            name = edittextname.text.toString()
            if  (name.isNotEmpty()){
                val intent = Intent(this,ReultActivity::class.java)
                intent.putExtra("extraName",name)
                startActivity(intent)

            }


        }


    }
}