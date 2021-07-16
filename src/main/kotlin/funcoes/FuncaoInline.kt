package funcoes

//simulação de contexto transacional
inline fun transacao(funcao: () -> Unit){
    println("Abrindo transação..")
    try{
        funcao();
    }finally {
        println("fechando transação..")
    }
}

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("Entrando no método $nomeFuncao")
    try{
        return funcao();
    }finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int):Int{
    return a+b;
}

fun main() {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }

    val resultado = executarComLog("somar"){
        somar2(3, 5)
    }

    println(resultado)
}