class CoffeeCup(val temperature: Int) {
    fun isTooHot(): Boolean {
        return temperature > 70
    }
}

fun main() {
    val cup = CoffeeCup(75)
    println("Is the coffee too hot? ${cup.isTooHot()}")
}