fun getCoffeePrice(size: String?): Double {
    return when (size?.lowercase()) {
        "small" -> 100.0
        "medium" -> 150.0
        "large" -> 200.0
        else -> 0.0
    }
}

fun main() {
    val price = getCoffeePrice(null)
    println("Coffee price: ₹$price")
}