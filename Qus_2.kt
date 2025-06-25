fun calculateTotalPrice(quantity: Int, pricePerCup: Double?): Double {
    return if (pricePerCup != null) {
        quantity * pricePerCup
    } else {
        0.0 // Default value if price isn't available
    }
}

fun main() {
    val quantity = 3
    val pricePerCup: Double? = 4.5

    val totalPrice = calculateTotalPrice(quantity, pricePerCup)

    println("Total price for $quantity cups of coffee: ₹$totalPrice")
}
