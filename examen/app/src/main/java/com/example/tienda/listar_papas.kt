package com.example.tienda

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import bdd.bdd_tienda
import kotlinx.android.synthetic.main.activity_listar_papas.*
import modelos.tienda

class listar_papas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar_papas)

        var usuarioTraje = intent.getStringExtra("usuario")

        Log.e("listarPapas usuario",usuarioTraje)

        var listaPapas = bdd_tienda.listarTiendas()

        var listNOmbres:ArrayList<String> = ArrayList()

        listaPapas.forEach {
            listNOmbres.add(it.nombre)
        }

//
        var adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            listNOmbres)
//
        listView_tiendas.adapter = adapter
//
//
        listView_tiendas.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->

            redirigirPapa(listaPapas.get(position),usuarioTraje)


        }




    }


    fun redirigirPapa(tienda: tienda,usuario : String){
        var intent = Intent(this,ver_papas_EAVHCH::class.java)
        intent.putExtra("tiendaEnviar",tienda)
        intent.putExtra("usuarioL",usuario )
        startActivity(intent)
    }
}
