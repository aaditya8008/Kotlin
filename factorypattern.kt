fun main() {
    var pizza1: pizza = pizza.factory.create("Peppy Paneer")
    println(pizza1)
    var pizza2: pizza = pizza.factory.create("Tomato")
    println(pizza2)
}

class pizza(val type: String, val toppings: String) {
    companion object factory { // factory object
        fun create(pizzatype: String): pizza {
            return when (pizzatype) {
                "Tomato" -> pizza("Tomato", "Tomato,cheese")
                "Peppy Paneer" -> pizza("paneer farm", "Paneer,cheese burst , tomato, onion")
                else -> pizza("Basic", "Onion,Cheese")
            }
        }
    }
    override fun toString(): String {
        return "Pizza(type='$type',toppins='$toppings')"
    }
}
