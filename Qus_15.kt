class Customer(var loyaltyPoints: Int) {
    fun addPoints(points: Int) {
        loyaltyPoints += points
        println("Points added. Total now: $loyaltyPoints")
    }
}

fun main() {
    val customer = Customer(50)
    customer.addPoints(20)
}