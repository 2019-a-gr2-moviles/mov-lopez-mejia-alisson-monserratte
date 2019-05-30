package com.example.listas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view_.*
import android.support.design.widget.Snackbar
import android.widget.Toast

class ListView_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_)

        val listaNombres = arrayListOf<String>()
        listaNombres.add("Andres enojon")
        listaNombres.add("Alexander putito")
        listaNombres.add("kevin enojon")

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            listaNombres)

        lv_ejemplo.adapter = adapter

        lv_ejemplo.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->

            Log.e("list-view","Posicion $position")
            mostrarSnack(view,listaNombres.get(position)+" Es super gay " + position.toString() )


        }


    }

    fun mostrarSnack(view: View, texto:String){
        Toast.makeText(this,texto,Toast.LENGTH_LONG).show()
        Snackbar
            .make(view, texto, Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()

    }


}
