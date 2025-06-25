fun filterCoffeeStartingWithC(coffees: List<String>): List<String> {
    return coffees.filter { it.startsWith("C", ignoreCase = true) }
}

fun main() {
    val coffees = listOf("Cappuccino", "Latte", "Cold Brew", "Mocha")
    val filtered = filterCoffeeStartingWithC(coffees)
    println("Coffees starting with 'C': $filtered")
}