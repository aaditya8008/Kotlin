fun main() {
    var car = automobile("car", 4, 5, true)
    var person = person("Yo", 73)
    println(person.age)
    println(person.name)
    println(car.x)
}

class automobile(val name: String, val tyres: Int, val maxseating: Int, hasairbag: Boolean) {
    var x = hasairbag // not a property but only parameter
    fun drive() {}
    fun applybrakes() {}
}

class nocondtruct {}

class person(namee: String, agee: Int) {
    init {
        println("HOLLAA") // called instantly when class is used
    }
    val name: String = "$namee Aditya"
    init {
        println("HOLLAa aGAINNN")
    }
    var age: Int = agee
}
