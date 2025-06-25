fun printUniqueOrderCount(orders: Set<String>) {
    println("Number of unique orders: ${orders.size}")
}

fun main() {
    val orders = setOf("Latte", "Espresso", "Latte", "Mocha")
    printUniqueOrderCount(orders)
}