package ExerciciosLocaliza.aula5

fun ehUmBomFilme(filme: String?): String{
    return when{
        filme.isNullOrBlank() -> "Erro, preciso de um nome para avaliar"
        filme.length < 5 -> "Um nome tão curto pode não ser bom"
        else -> "É, talvez seja bom"
    }
}

fun criarNumeros(){
    val numeros = List(10) { i -> i+1 }
    val numero = mutableListOf<String>()
    numeros.forEach { num ->
        numero.add(if(num % 2 == 0) num.toString() else "-")
    }

    print(numero)
}


fun main() {
    println(ehUmBomFilme("Vingadores"))
    criarNumeros()
}