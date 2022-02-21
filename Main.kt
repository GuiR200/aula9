fun main(args: Array<String>) {
    atividade3()
}

fun atividade1(): Unit {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toFloat()
    println("Digite o  segundo número:")
    val num2 = readLine()!!.toFloat()

    if (num1 > num2) {
        println("O primeiro número é maior que segundo!!!")

    } else {
        println("O segundo é maior que o primeiro!!!")
    }
}

fun atividade2(): Unit {
    println("Digite um número:")
    val num = readLine()!!.toFloat()

    if (num > 0) {
        println("O número $num é positivo!!!")

    } else {
        println("O número $num é negativo!!!")
    }
}

fun atividade3(): Unit {
    println("Digite uma letra qualquer:")
    val letra = readLine()!!

    if (letra.equals("a", true) ||
        letra.equals("e", true) ||
        letra.equals("i", true) ||
        letra.equals("o", true) ||
        letra.equals("u", true)
    ) {
        println("A letra $letra é uma vogal!!!")
    } else {
        println("A letra $letra é uma consoante!!!")
    }
}