package com.example.tienda

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import bdd.bdd_tienda
import kotlinx.android.synthetic.main.activity_listar_papas.*
import modelos.tienda

class listar_papas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var listaPapas = bdd_tienda.listarTiendas()

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            listaPapas)

         listView_tiendas.adapter = adapter


        listView_tiendas.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->

            redirigirPapa(listaPapas.get(position))


        }


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar_papas)


    }


    fun redirigirPapa(tienda: tienda){
        var intent = Intent(this,ver_papas_EAVHCH::class.java)
        intent.putExtra("tiendaEnviar",tienda)
        startActivity(intent)
    }
}
