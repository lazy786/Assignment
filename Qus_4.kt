fun greetCustomer(name: String?): String {
    val displayName = name ?: "Guest"
    return "Hello, $displayName!"
}

fun main() {
    val name1: String? = "Bikash"
    val name2: String? = null

    println(greetCustomer(name1))
    println(greetCustomer(name2))
}
