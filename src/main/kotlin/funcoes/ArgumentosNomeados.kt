package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String{
    return "$funcionario é subordinado(a) à $chefe"
}

fun main() {
    println(relacaoDeTrabalho("Maria", "João"))

    //Clareza e possibilidade de inversão de argumentos, se não houver ajuda da IDE
    println(relacaoDeTrabalho(funcionario = "Maria", chefe = "João"))
}