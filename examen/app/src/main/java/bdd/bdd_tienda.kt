package bdd

import modelos.tienda

class bdd_tienda() {

    companion object {
        var tiendas : ArrayList <tienda> = ArrayList()


        fun crearTienda(tienda: tienda){
                tiendas.add(tienda)
        }

        fun listarTiendas(): List<tienda>{
            return tiendas
        }

        fun eliminarTienda(nombreTienda: String){
            tiendas.removeAll { it.nombre== nombreTienda }

        }

        fun editarTienda(tienda: tienda){

            var indice = tiendas.indexOfFirst { it.nombre == tienda.nombre }
            tiendas[indice] = tienda
        }
    }
}