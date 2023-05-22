fun main() {

    var person = person("Yo", 73) // primary constructor
    println(person.age)
    println(person.name)

    var perso = person("Yo") // secondary constructor
    println(perso.age)
    println(perso.name)
}

class person(namee: String, agee: Int) {
    init {
        println("HOLLAA") // called instantly when class is used
    }
    val name: String = "$namee Aditya"
    init {
        println("HOLLAa aGAINNN")
    }
    var age: Int = agee
    constructor(namme: String) : this("Aditya", 10)
}
