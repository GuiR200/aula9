import kotlin.random.Random

class Adivinha {
    fun jogar(palpite: Int): String {
        val numeroSortiado = Random.nextInt(0, 10)

        return if (palpite == numeroSortiado) "Você acertou!!!" else "Errrooou!!!"
    }
}