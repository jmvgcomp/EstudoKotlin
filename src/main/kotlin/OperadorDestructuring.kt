
data class Carro(val marca: String, val modelo: String)

fun main() {

    val (marca, modelo) = Carro("Ford", "Fusion")

    println("${marca}: $modelo")

    val (marido, mulher) = listOf("João", "Maria")
    println("Marido: ${marido}, Mulher: $mulher")

    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar.")

}
