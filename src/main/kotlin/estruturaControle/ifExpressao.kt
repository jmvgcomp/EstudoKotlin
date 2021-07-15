package estruturaControle

fun main() {
    val num = 1
    val num1 = 4

    val maiorValor = if (num > num1){ //se vazio retorna Kotlin.Unit
        println("Executa o if...")
        num //retorno
    }else{
        println("Exceuta o else..") //pode ser vários processamentos
        num1 //retorno
    }

    //forma mais simples
    var maiorValor2 = if(num > num1) num else num1

    println("O maior valor é $maiorValor.")
}