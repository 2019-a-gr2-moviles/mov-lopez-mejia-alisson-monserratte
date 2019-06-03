package bdd

import modelos.productos

class bdd_productos {
    companion object {
        var productos : ArrayList <productos> = ArrayList()

        fun crearProductos(producto : productos){
            productos.add(producto)
        }

        fun listarProductos(tiendaId: String): List<productos>{

            val productoTienda = productos.filter { it.tiendaId == tiendaId }

            return productoTienda
        }




        fun eliminarProductos(nombreProducto: String){
            productos.removeAll { it.nombre== nombreProducto }

        }

        fun editarTienda(producto: productos){

            var indice = productos.indexOfFirst { it.nombre == producto.nombre }
            productos[indice] = producto
        }


    }
}