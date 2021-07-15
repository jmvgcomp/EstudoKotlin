package importacoes

import importacoes.pacoteA.simplesFuncao as funcaoSimples
import importacoes.pacoteA.Geral
import importacoes.pacoteA.FaceMoeda.CARA
import importacoes.pacoteB.*

fun main(){
    println(funcaoSimples("Ok."))

    val geral = Geral("Teste")
    println(geral.nome)

    println(CARA)

    println("Soma: ${soma(3, 2)} | Subtração: ${subtracao(1, 5)}")
}