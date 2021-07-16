package funcoes

import java.util.*

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agora(): Horario{
    val agora = Calendar.getInstance();

    with(agora){
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    } //evita utilizar agora.get(Calendar.HOUR), agora.get[..], agora.get[...]
}

fun main() {
    //simulação de multiplos retornos a partir do operador destructuring
    val (h, m, s) = agora();
    println("São $h:$m:$s")
}