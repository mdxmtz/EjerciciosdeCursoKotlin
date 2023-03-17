fun main(){

    //Función que reciba 2 numeros decimales y su valor de retorno sea  Doble (Regrese el resultado)
    // Guardar ese valor en una variable y la van a imprimir con println



    val res=multiplicacion(10.15,3.2);
    println("El resultado es "+ "%.2f".format(res))



}

fun multiplicacion(x:Double, y:Double):Double {
    val resultado:Double = x*y;
    return resultado;

}