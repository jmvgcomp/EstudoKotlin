fun main() {
    val a = 1;

    println(a.toString()); //numero pra string

    //string pra numero
    println("1.9".toDouble() + 3) // 4.9
    println("Teste".toIntOrNull()) // null
    println("teste".toIntOrNull() ?: 0)

}