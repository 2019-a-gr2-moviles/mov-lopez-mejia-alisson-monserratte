package com.example.tienda

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import bdd.bdd_tienda
import kotlinx.android.synthetic.main.activity_crear_papas.*
import modelos.tienda

class crearPapas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        var nombreTrajeGuardado = intent.getStringExtra("usuario").toString()

        var inputNombreT = txt_tiendaNombre.text.toString()
        var inputDireccionT = txt_tiendaDireccion.text.toString()
        var fechaApertura = txt_fechaLanzamiento.text.toString()
        var rucT = txt_RUC.text.toString() as Int
        var matrizT = switchSioNo.isChecked().toString()


        var papa = tienda(
            inputNombreT,
            inputDireccionT,
            fechaApertura,
            rucT,
            matrizT
        )

        Log.e("switch",matrizT)



        btn_guardar.setOnClickListener {


            bdd_tienda.crearTienda(papa)

            Toast.makeText(this,nombreTrajeGuardado+" Creo 1 tienda",Toast.LENGTH_LONG).show()
        }


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_papas)
    }











}
