package funcoes

import kotlin.math.max

//Com Unit é possível encadear chamada de funções


fun imprimeMaior1(a: Int, b: Int): Unit{
    println(max(a, b))
    return
}
fun imprimeMaior2(a: Int, b: Int){
    println(max(a, b))
    return Unit;
}

fun main() {
    imprimeMaior1(1, 2)
    imprimeMaior2(1, 2).run { 2 > 3  }.run { println("Resultado: $this") }
}