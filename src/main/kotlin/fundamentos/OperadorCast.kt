package fundamentos

fun imprimirConceito(x: Any){

    //caso o tipo passado seja diferente de Int utilizando o 'as'
    //Haverá erro de cast, para fazermos um cast de forma segura
    //é necessário 'as?'
    when(x as? Int){
        10, 9 -> println("A")
        7, 8 -> println("B")
        5, 6 -> println("C")
        3, 4 -> println("D")
        2, 1, 0 -> println("Nota inválida")
    }
}

fun main(){
    val notas = listOf(9.1, 5.4, 3.1, 5, 10)
    for(nota in notas){
        imprimirConceito(nota.toInt())
    }
}