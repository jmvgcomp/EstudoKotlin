package classes

class Data(var dia: Int, var mes: Int, var ano: Int){

    fun formatar():String{
        return "$dia/$mes/$ano"
    }
}

fun main() {
    val nascimento = Data(dia = 18,mes = 7,ano = 2021)
    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento) { println("${dia}/${mes}/${ano}") }
    println(nascimento.formatar())
}