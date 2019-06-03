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

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_papas)


        var nombreTrajeGuardado = intent.getStringExtra("usuario").toString()



        var inputNombreT = txt_tiendaNombre.text.toString()
        var inputDireccionT = txt_tiendaDireccion.text.toString()
        var fechaApertura = txt_fechaLanzamiento.text.toString()
        var rucT = txt_RUC.text.toString()
        var matrizT = switchSioNo.isChecked().toString()


        var papa = tienda(
            inputNombreT,
            inputDireccionT,
            fechaApertura,
            rucT,
            matrizT
        )

        Log.e("switchA",matrizT)
        Log.e("nomA",inputNombreT)
        Log.e("dirA",inputDireccionT)
        Log.e("fechaA",fechaApertura)
        Log.e("rucA",rucT)
        Log.e("papa",papa.toString())



        btn_guardar.setOnClickListener {

            if(inputNombreT.isEmpty() || inputDireccionT.isEmpty() ||
                fechaApertura.isEmpty() || rucT.isEmpty()
               ){


                Toast.makeText(this,nombreTrajeGuardado+" Los campos deben estar llenos",Toast.LENGTH_LONG).show()
            }else{
                Log.e("nom",inputNombreT)
                Log.e("dir",inputDireccionT)
                Log.e("fecha",fechaApertura)
                Log.e("ruc",rucT)
                Log.e("matriz",matrizT)
                bdd_tienda.crearTienda(papa)
                Toast.makeText(this,nombreTrajeGuardado+" Creo 1 tienda",Toast.LENGTH_LONG).show()



            }

        }

    }


}
