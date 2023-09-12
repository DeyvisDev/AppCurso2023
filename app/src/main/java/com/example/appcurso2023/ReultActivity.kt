package com.example.appcurso2023

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReultActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reult)

        val tvResult = findViewById<TextView>(R.id.txtName)

        val name:String = intent.extras?.getString("extraName").orEmpty()
        tvResult.text ="Hola $name"
    }
}