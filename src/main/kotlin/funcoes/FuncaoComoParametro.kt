package funcoes

//basico
class Operacoes{
    fun somar(a: Int, b: Int): Int{
        return a+b;
    }
}

fun somar(a: Int, b: Int): Int{
    return a + b;
}
fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int{
    return funcao(a, b);
}
// ==

// exemplo prático

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>();

    //ou lista.forEach{ elemento -> ... }
    for(elemento in lista){
        if(filtro(elemento)){
            listaFiltrada.add(elemento);
        }
    }
    return listaFiltrada;
}

fun comTresLetras(nome: String):Boolean{
    return nome.length == 3;
}


fun main() {
    println(calc(1, 3, Operacoes()::somar))
    println(calc(1, 3, ::somar))


    val nomes = listOf("Ana", "Gui", "Pedro", "Rebeca", "Bia")
    println(filtrar(nomes, ::comTresLetras))
}