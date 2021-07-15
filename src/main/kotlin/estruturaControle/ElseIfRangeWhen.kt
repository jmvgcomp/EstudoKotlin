package estruturaControle

fun main() {
    val nota = 10.0;

    //Usando if com range
    if(nota in 9.0..10.0){
        println("Ótimo")
    }else if(nota in 7.0..8.99) {
        println("Parabéns")
    }else if(nota in 5.0..6.99) {
        println("Pode melhorar")
    }else if(nota in 0.0..4.99){
        println("Até o próximo semestre")
    }else{
        println("Nota inválida")
    }

    //Usando when com range
    when (nota) {
        in 9.0..10.0 -> println("Ótimo")
        in 7.0..8.99 -> println("Parabéns")
        in 5.0..6.99 -> println("Pode melhorar")
        in 0.0..4.99 -> println("Até o próximo semestre")
        else -> println("Nota inválida")
    }
}