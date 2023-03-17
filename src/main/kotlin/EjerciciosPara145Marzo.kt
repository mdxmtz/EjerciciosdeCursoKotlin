import java.util.*

fun main(){

    println("Ejercicio 1");
    var promedio=getPromedio(8.0,10.0,8.5);
    println("Promedio de 8, 10 y 8.5 es $promedio");
    println("===============================");
    println();
    println();

    println("Ejercicio 2");
    var suma=suma(4,6);
    println("La suma de 4 + 6 es igual a $suma");
    println("===============================");
    println();
    println();

    println("Ejercicio 3");
    var area=getAreaTriangulo(4.0,3.0);
    println("El area del triangulo de base 4 y altura 3 es igual a $area");
    println("===============================");
    println();
    println();

    println("Ejercicio 4");
    var pesos=conversionDolarAPesos(18.5,39.0);
    println("39 dolares a un tipo de cambio de 18.5 es $pesos");
    //println("39 dolares a un tipo de cambio de 18.5 es $conversionDolarAPesos(18.5,39.0)");
    println("===============================");
    println();
    println();

    println("Ejercicio 5");
    var edad=getEdad(1984);
    println("Su edad es $edad");
    println("===============================");
    println();
    println();

}

/**
 * 1. Una función que calcule el promedio de tres números dados como parámetros de tipo Double y muestre el resultado.
 */
fun getPromedio(x: Double, y: Double, z: Double) :Double{
    return (x+y+z)/3.0;
}

/**
 * 2. Una función que calcule la suma de dos números enteros dados como parámetros y muestre el resultado.
 */
fun suma(a:Int, b:Int):Int{
    return a+b;
}

/***
 * 3. Una función que calcule el área de un triángulo a partir de la base y la altura dadas como parámetros
 * de tipo Double y muestre el resultado.
 */
fun getAreaTriangulo(base:Double, altura:Double):Double{
   return (base*altura)/2;
}

/**
 * 4. Una función que convierta una cantidad de dólares dada como parámetro de tipo Double a pesos mexicanos y
 * regrese el valor Double, después en la función main guardar el dato en una variable y mostrarlo posteriormente.
 */
fun conversionDolarAPesos(tipoCambio:Double, dolares:Double):Double{
    return tipoCambio*dolares;
}

/**
 * 5. Una función que calcule la edad de una persona, la función recibirá un Entero que sera el año
 * de nacimiento de la persona como parámetro y mostrara la edad de dicha persona.
 */
fun getEdad(year :Int):Int{

    return 2023-year;

}

