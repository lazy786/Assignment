fun prepareCoffee(coffeeType: String, sugarLevel: Int = 1) {
    println("Preparing $coffeeType with $sugarLevel spoon(s) of sugar.")
}

fun main() {
    prepareCoffee("Latte")
    prepareCoffee("Espresso", 0)
}