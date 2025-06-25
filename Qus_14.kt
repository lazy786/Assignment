fun applyDiscount(prices: List<Double>): List<Double> {
    return prices.map { it * 0.9 }
}

fun main() {
    val prices = listOf(100.0, 200.0, 300.0)
    val discounted = applyDiscount(prices)
    println("Discounted prices: $discounted")
}