package com.example.tienda

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_gestion_papas.*

class gestionPapas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var nombreUsuarioTraje = " "

        nombreUsuarioTraje = intent.getStringExtra("usuario").toString()

        Log.e("nombreUsuaioTraje",nombreUsuarioTraje)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestion_papas)

        btn_crear_tienda.setOnClickListener {
            irActivadadCrearPapas(nombreUsuarioTraje)
        }

        btn_gestion_tiendas.setOnClickListener {
            irActividadGestionPapas(nombreUsuarioTraje)


        }

    }




    fun irActividadGestionPapas(nombreUsuarioTraje :String){
        Log.e("entro",nombreUsuarioTraje)

        val intent = Intent(this,listar_papas::class.java)

        //intent.putExtra("usuario",nombreUsuarioTraje)

        startActivity(intent)
    }



    fun irActivadadCrearPapas(nombreUsuarioTraje : String){
        val intent = Intent (this,crearPapas::class.java)
        intent.putExtra("usuario",nombreUsuarioTraje)
        startActivity(intent)
    }


}
