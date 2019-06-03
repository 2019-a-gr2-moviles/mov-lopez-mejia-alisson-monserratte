package com.example.tienda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import modelos.tienda

class ver_papas_EAVHCH : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var tiendaPosicion = intent.getParcelableExtra<tienda>("tiendaEnviar")

        Log.e("tienda EAVHCH","" +tiendaPosicion  )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_papas__eavhch)
    }
}
