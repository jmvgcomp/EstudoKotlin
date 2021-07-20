package classes

const val diretamenteNoArquivo: String = "Bom Dia"

fun topLevel(){
    val local = "Fulano!"
    println("$diretamenteNoArquivo, $local")
}

class Classe1{
    var variavelDeInstancia: String = "Boa noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano"
    }

    fun fazer(){
        val local = 7;
        if(local > 1){
            println("$diretamenteNoArquivo, $variavelDeInstancia, $constanteDeClasse, $local")
        }
    }

}

fun main() {
    topLevel();
    Classe1.constanteDeClasse
    Classe1().variavelDeInstancia
    Classe1().fazer()

}