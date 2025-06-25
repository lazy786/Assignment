data class Barista(val name: String, val favoriteCoffee: String?)

fun printBaristaFavorite(barista: Barista) {
    val coffee = barista.favoriteCoffee ?: "Unknown"
    println("${barista.name}'s favorite coffee is $coffee.")
}

fun main() {
    val barista1 = Barista("Riya", "Latte")
    val barista2 = Barista("Aman", null)
    printBaristaFavorite(barista1)
    printBaristaFavorite(barista2)
}