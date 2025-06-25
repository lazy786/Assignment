class CoffeeMachine(var status: String) {
    fun brewCoffee() {
        if (status == "On") {
            println("Brewing coffee...")
        } else {
            println("Machine is Off. Please turn it on.")
        }
    }
}

fun main() {
    val machine = CoffeeMachine("On")
    machine.brewCoffee()
}