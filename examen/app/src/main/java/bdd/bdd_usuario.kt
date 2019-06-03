package bdd

class bdd_usuario {

    companion object {
        var listaUsuario : ArrayList <String> = ArrayList()
        var nombreUsuario: String = " "


        fun registrar(usuarioNombre : String){

            nombreUsuario = usuarioNombre
            listaUsuario.add(nombreUsuario)

        }
    }



}