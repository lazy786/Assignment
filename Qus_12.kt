data class CoffeeMenu(val items: List<String>) {
    fun printMenu() {
        println("Menu:")
        items.forEach { println("- $it") }
    }
}

fun main() {
    val menu = CoffeeMenu(listOf("Espresso", "Cappuccino", "Latte"))
    menu.printMenu()
}