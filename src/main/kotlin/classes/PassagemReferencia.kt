package classes

//Error! Val não pode ser reatribuida
//fun porReferencia(velocidade: Int){
//    velocidade++
//}

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro){
    carro.velocidade++
}

fun main() {
    var carro1 = Carro("Ford", "Fusion")
    val carro2 = carro1
    carro2.modelo = "Edge"
    println(carro1)

    carro1 = Carro("Audi", "A4")
    porReferencia(carro1)
    porReferencia(carro2)
    println(carro1)
    println(carro2)

}