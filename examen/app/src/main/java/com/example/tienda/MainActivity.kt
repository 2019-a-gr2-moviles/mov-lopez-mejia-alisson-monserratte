package com.example.tienda

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import bdd.bdd_usuario
import kotlinx.android.synthetic.main.activity_crear_papas.*
import kotlinx.android.synthetic.main.activity_main.*
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nombreUsuario = " "


        btn_entrar.setOnClickListener{
            nombreUsuario = input_name.text.toString()
            var noEsVacio = guardarUsuario(nombreUsuario)
            if(noEsVacio){
                irActividad(nombreUsuario)
                Toast.makeText(this,nombreUsuario +" ingreso " ,Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"El campo name debe contener su nombre " ,Toast.LENGTH_LONG).show()
            }


        }


    }

    fun guardarUsuario(nombreUsuario : String):Boolean{
        if (nombreUsuario != ""){

            bdd_usuario.registrar(nombreUsuario)

            return true
        }else
            return false
    }


    fun irActividad(nombreUsuario: String) {
        val intent = Intent(
            this, gestionPapas::class.java
        )

        intent.putExtra("usuario",nombreUsuario)
       startActivity(intent)
    }

}

