fun isValidCoffeeType(coffeeType: String?, validTypes: List<String>): Boolean {
    return coffeeType != null && validTypes.contains(coffeeType)
}

fun main() {
    val validTypes = listOf("Latte", "Espresso", "Mocha")
    val result = isValidCoffeeType("Latte", validTypes)
    println("Is coffee type valid? $result")
}