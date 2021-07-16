package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray{
    println(a)
    return numeros.sortedArray();
}

fun main() {
    for (n in ordenar(1, 4, 3, 6, 8, 532, 9, a= 3)) {
        print("$n ")
    }
}