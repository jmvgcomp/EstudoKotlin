package funcoes

import kotlin.math.pow

fun incremento(num: Int){
    //os parametros da função são imutaveis
    //num++; //num = num + 1
}

//Parametros padrão
fun potencia(base: Int = 2, expoente: Int = 1): Int{
    return base.toDouble().pow(expoente.toDouble()).toInt();
}

fun main() {
    println(potencia(5, 2))
    println(potencia(10))
    println(potencia(base = 10))
    println(potencia(expoente = 8))
}