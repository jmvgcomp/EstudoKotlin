package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean){
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main() {
    val p1 = Produto("IPad", 2349.90, 0.20, ativo = true)
    println(p1.precoComDesconto)

    val p2 = Produto("Galaxy Note 7", 2699.49, 0.50, ativo = false)
    with(p2){
        println("$nome\n\tDe: $preco \n\tPor: $precoComDesconto")
        if(inativo) {
            preco = 0.0;
            println("Depois de inativo: $precoComDesconto")
        }
    }
}