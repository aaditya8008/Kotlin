fun main() {
    val op = calculator()
    println(op.add(3, 3))
}

class calculator {
    lateinit var message: String // if want to give value later

    fun add(x: Int, y: Int): Int {
        return (x + y)
    }

    fun multiply(x: Int, y: Int): Int {
        return (x * y)
    }
    fun divide(x: Int, y: Int): Int {
        return (x / y)
    }
    fun subtract(x: Int, y: Int): Int {
        return (x - y)
    }
}
