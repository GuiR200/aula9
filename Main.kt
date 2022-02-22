fun main(args: Array<String>) {
    atividade5()
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

fun atividade4(): Unit {
    val jogo = Adivinha()
    println("Digite um número entre 0 ou 10 para o seu palpite:")
    val palpite = readLine()!!.toInt()

    if (palpite in 0..10) {
        println(jogo.jogar(palpite))
    } else {
        println("Palpite inválido!!!")
    }
}

fun atividade5(): Unit{
    val jogar = Jokenpo()
    println("Digite um número 1-Pedra, 2-Papel ou 3-Tesoura")
    val jogador = readLine()!!.toInt()

    if (jogador in 1..3) {
        println(jogar.jogar(jogador))
    }else{
        println("Jogada inválidada!!!")
    }
}