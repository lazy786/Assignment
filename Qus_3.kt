data class CoffeeOrder(
    val type: String,
    val size: String
)
fun printOrderSummary(order: CoffeeOrder) {
    println("Order Summary:")
    println("Coffee Type: ${order.type}")
    println("Size: ${order.size}")
}
fun main() {
    val myOrder = CoffeeOrder(type = "Cappuccino", size = "Medium")
    printOrderSummary(myOrder)
}
