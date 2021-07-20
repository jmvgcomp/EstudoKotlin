package classes

class Cliente1{
    constructor(nome: String){
        this.nome = nome;
    }
    var nome: String
        get() = "Meu nome é $field"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }

}

fun main() {
    val c1 = Cliente1("")
    println(c1.nome)

    val c2 = Cliente1("Pedro")

    println(c2.nome)
}