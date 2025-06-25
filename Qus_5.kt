class CoffeeShop(val name: String) {
    fun printOpeningHours() {
        println("$name is open from 8:00 AM to 8:00 PM")
    }
}

fun main() {
    val shop = CoffeeShop("Cafe Aroma")
    shop.printOpeningHours()
}