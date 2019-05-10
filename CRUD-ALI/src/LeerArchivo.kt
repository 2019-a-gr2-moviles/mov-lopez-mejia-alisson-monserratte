

class LeerArchivo(){


}


class Libro(var nombre: String?, var autor: String?, var anio: String?) {

    override fun toString(): String {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", anio=" + anio + '}'.toString()
    }

}

