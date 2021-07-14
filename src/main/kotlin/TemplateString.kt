fun main() {
    val aprovados = listOf("João", "Matria", "Pedro");
    println("O primerio aprovado foi ${aprovados.first()}.") //ou ${aprovados[0]}

    //condicionais dentro de template string
    val bomHumor = true;
    println("Hoje estou ${if(bomHumor) "feliz" else "triste"}.")
}

