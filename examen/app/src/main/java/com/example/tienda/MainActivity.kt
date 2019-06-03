package com.example.tienda

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_crear_papas.*
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_guardar.setOnClickListener{
            irActividad()
        }
    }





    fun irActividad() {
        val intent = Intent(
            this, gestionPapas::class.java
        )
       startActivity(intent)
    }

}

