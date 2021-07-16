package fundamentos

fun main() {

    semRetorno(2, 3)
    println(retorno(2, 4));
}

fun semRetorno(a: Int, b: Int){
    println(a + b);
}

fun retorno(a: Int, b: Int): Int{
    return a + b;
}