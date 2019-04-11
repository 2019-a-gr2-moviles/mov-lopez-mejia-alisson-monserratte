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