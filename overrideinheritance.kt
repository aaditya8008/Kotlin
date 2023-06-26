fun main() {
    val one = oneplus("Smartphone")
    println(one.name)
    println(one.size)
    println(one.toString())
}

open class phone(val type: String) {
    open var name: String = "Unknown"
    open var size: Int = -1
    fun makecall() {
        println("Can Make Call")
    }
    open fun display() {
        println("Can Display")
    }
}

class oneplus(typeparam: String) : phone(typeparam) {
    override var name = "oneplus 10r"
    override var size = 6
    override fun display() {
        super.display() // previous
        println("Amoled")
    }
    override fun toString(): String {
        return "Fooled"
    }
}
