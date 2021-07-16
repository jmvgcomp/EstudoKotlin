package fundamentos.importacoes

import fundamentos.importacoes.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.importacoes.pacoteA.Geral
import fundamentos.importacoes.pacoteA.FaceMoeda.CARA
import fundamentos.importacoes.pacoteB.*

fun main(){
    println(funcaoSimples("Ok."))

    val geral = Geral("Teste")
    println(geral.nome)

    println(CARA)

    println("Soma: ${soma(3, 2)} | Subtração: ${subtracao(1, 5)}")
}