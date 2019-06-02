package com.example.tienda

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        guardarNombreInicio("ali")
    }


    fun guardarNombreInicio(val nombre: String){
       val  fileName = "ali"
        val fos: FileOutputStream = openFileOutput(fileName,Context.MODE_PRIVATE)

        fos.writer(nombre)
        fos.close()
    }
}
