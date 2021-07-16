package fundamentos

fun main() {
    val a: Int? = null; //safe call operator
    println(a?.dec())

    //Elvis operator
    val opcional: String? = null;
    val obrigatorio: String = opcional ?: "Valor padrão";

    println(obrigatorio)

    //Forçando um null pointer exception - test
    val testeNullPointer: Int? = null;
    println(testeNullPointer?.inc())
    println(testeNullPointer!!.inc()) //forçando chamada

}