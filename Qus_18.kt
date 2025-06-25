fun printMostExpensiveCoffee(coffeeMap: Map<String, Double>) {
    val mostExpensive = coffeeMap.maxByOrNull { it.value }
    println("Most expensive coffee: ${mostExpensive?.key} at ₹${mostExpensive?.value}")
}

fun main() {
    val prices = mapOf("Latte" to 150.0, "Mocha" to 180.0, "Espresso" to 120.0)
    printMostExpensiveCoffee(prices)
}