

fun main() {

    // Los comentario de una sola línea comienzan con // y finalizan hasta el salto de línea
    obtenerHora("8:00", "Monterrey",28);

    suma10AunNumero(54.0);
    suma(1.4,34);

    println("Ingresa tu nombre");
    val nombre= readln();
    println("El nombre es $nombre")
}

/**
 *  Declaracción de una función llamada sayHello
 *  recibe un parametro de tipo Texto, el cual llamamos nombre
 */
fun obtenerHora(hora:String,
                ciudad: String,
                diaDelMes: Int) {

    println("La hora actual es $hora y la ciudad es $ciudad y el ldia del mes es $diaDelMes")

}

fun suma10AunNumero(
    num:Double
){
    val numASumar=10
    val resultado=num + numASumar
    println("El numero $num mas $numASumar es igual a $resultado")

}

fun suma(num:Double,
         numASumar:Int) : Double{
    val numASumar=10
    val resultado=num + numASumar
    println("El numero $num mas $numASumar es igual a $resultado")
    return resultado;

}