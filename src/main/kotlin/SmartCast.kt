fun smartCast(x: Any){
    if(x is String){
        println(x.uppercase())
    }else if(x is Int){
        println(x.plus(3))
    }else{
        println("outro tipo")
    }
}

fun whenSmartCast(x: Any){
    when(x){
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("outro tipo")
    }
}

fun main() {
    smartCast(3)
    whenSmartCast(3) //melhor utilizado
}