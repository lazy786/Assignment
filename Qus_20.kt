fun printFirstSortedCoffeeName(names: List<String>) {
    val sorted = names.sorted()
    if (sorted.isNotEmpty()) {
        println("First coffee alphabetically: ${sorted.first()}")
    }
}

fun main() {
    val names = listOf("Latte", "Cappuccino", "Espresso", "Mocha")
    printFirstSortedCoffeeName(names)
}