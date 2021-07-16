package fundamentos.estruturaControle

fun main() {
    //range crescente, 1 e 10 entram no laço
    for(i in 1..10){
        print("$i\n")
    }

    //range decrescente, 10 e 1 entram no laço
    for(i in 10 downTo 1){
        print("$i\n") 
    }

    //range crescente com passos
    for(i in 0..10 step 5){
        print("$i\n"); // 0, 5, 10
    }

    //range decrescente com passos
    for(i in 10 downTo 0 step 5){
        print("$i\n"); //10, 5, 0
    }

    val alunos = arrayListOf("André", "Marcelo", "Amanda", "Camila");
    for((index, aluno) in alunos.withIndex()) println("${index + 1} - $aluno")
//      saída
//    1 - André
//    2 - Marcelo
//    3 - Amanda
//    4 - Camila

}