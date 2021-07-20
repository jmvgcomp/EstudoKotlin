package classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero: String


    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }


}

//ou
class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme("O Poderoso Chefão", 1972, "Drama")
    with(filme){
        println("O ${genero} - ${nome} foi lançado em ${anoLancamento}")
    }
}