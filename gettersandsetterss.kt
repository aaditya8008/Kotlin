fun main() {
    val p1 = person("Aditya", 21)
    println(p1.name)
    println(p1.age)
    p1.age = 35
    println(p1.age)
}

class person(nameparam: String, ageparam: Int) {
    var name: String = nameparam
        get() {
            println("Get()")
            return field.lowercase()
        }
    var age = ageparam // field=value
        set(value) {
            if (value > 20) {
                field = value
            } else {
                println("Can't do")
            }
        }
}
