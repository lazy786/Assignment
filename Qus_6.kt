fun getHighestPrice(prices: List<Double>): Double? {
    return prices.maxOrNull()
}

fun main() {
    val prices = listOf(100.0, 150.0, 130.0)
    val highest = getHighestPrice(prices)
    println("Highest price: ₹$highest")
}