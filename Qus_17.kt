data class CoffeeBean(val name: String, val roastLevel: String)

fun main() {
    val beans = listOf(
        CoffeeBean("Arabica", "Medium"),
        CoffeeBean("Robusta", "Dark"),
        CoffeeBean("Liberica", "Light")
    )

    beans.forEach {
        println("${it.name} - Roast: ${it.roastLevel}")
    }
}