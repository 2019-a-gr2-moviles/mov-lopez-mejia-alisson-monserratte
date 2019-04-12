import java.util.*

fun main(args: Array<String>)
{
    //println("hello, world!")

    //Variables

    //Variables que pueden mutar

    //Mutables

    var nombre = "Adrian"

    nombre ="Vicente"

    //Inmutables

    val nombreI = "Adrian"

    //nombreI= "Vicente"

    val apellido: String ="Eguez"
    val edad: Int = 29
    val sueldo: Double = 1.21
    val casado: Boolean = false
    val profesor: Boolean = true
    val hijos: Nothing? = null

    // Duck Typing
    /**
     * Si parece un pato
     * Si camina como un pato
     * Si suena como pato
     * Si vuela como pato
     * Posiblemente es un pato
     */

    //Condicionales

    if(apellido =="Eguez" || nombre =="Adrian") {
    println("Verdadero")
    }else{
        println("falso")
    }

    val tieneNombreYApellido = if (apellido!=null && nombre!=null ) "ok" else "no"
    println(tieneNombreYApellido)
    estaJalado(1.8)
    estaJalado(1.0)
    estaJalado(8.9)
    estaJalado(0.0)

    holaMundo("Adrian")
    holaMundoAvanzado(2.2)
    val total = sumarDosNumeros(2,5)
    println(total)


    // ARREGLOS

    val arregloCumpleanos:Array <Int> = arrayOf(1,2,3,4)

    var arregloTodo:Array<Any> = arrayOf(1,"awrwer",true)

    arregloCumpleanos[0]=5
    arregloCumpleanos.set(0,5)

     arregloTodo = arrayOf(5,2,3,4)

   // val fecha = Date()
   // fecha.time = 11231231
   // fecha.year = 2000
    //fecha = Date(1989,6,10)

    val notas = arrayListOf(1,2,3,4,5,6)

    // for each -> Itera el arreglo

    notas.forEachIndexed { indice, nota ->
        println("Indice: $indice")
        println("Nota: $nota")

    //return Unit

    }
    // impares +1 pares +2
    val a = notas.map{nota ->
       if(nota%2 == 0)  nota+2 else nota+1
    }



    println(a)

    a.forEach {
        paraImpar(it)
       // println("Notas 2 : $it")
    }


    val respuestaFilter = notas.filter{

        it  in 3..5
        //it  > 2 && it <5
    }
        .map{
            it * 2
        }

    println(respuestaFilter)

 // map Mutar o cambiar el arreglo

    // filter Filtrar el arreglo


    val novias = arrayListOf(1,2,2,3,4,5)

    val respuestaNovia: Boolean = novias.any{
        it < 2
    }

    println(respuestaNovia)

    val tazos =  arrayListOf(1,2,3,4,5,6,7)

    val respuestaTazos = tazos.all{
        it > 1
    }


    println(respuestaTazos)

    val totalTazos = tazos.reduce { valorAcumulado, tazo ->
        valorAcumulado + tazo
    }

    println(totalTazos)



}

fun paraImpar(nota:Int){
    val modulo = nota%2
    when(modulo){
        0 -> {
            nota+2
        }
        else->{
            nota+1
        }
    }
}


fun estaJalado(nota: Double) :Double {
    when (nota){
        7.0 -> {
            println("Pasaste con las justas")
        }
        10.0 ->{
            println("Genial :D felicitaciones")
        }
        0.0->{
            println("Dios mio que vago")
        }
        else -> {
            println("Tu nota es $nota")
        }
    }
    return nota
}


fun holaMundo(mensaje: String ):Unit{
    println("Mensaje: $mensaje.")

}

fun holaMundoAvanzado(mensaje: Any ):Unit{
    println("Mensaje: $mensaje.")

}

fun sumarDosNumeros(numUno: Int , numDos: Int):Int {
    return numUno + numDos
}




