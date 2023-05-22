fun main() {
    val p1 = person("Aditya", 21)
    println(p1.name)
    println(p1.age)
    p1.age = -12
}

class person(nameparam: String, ageparam: Int) {
    var name: String = nameparam
        get() {
            println("Name getter is called")  //write below to apply
            return field.uppercase()
        }

    var age: Int = ageparam
        set(value) {
            println("Ages Setter called")
            if (value > 0) field = value else println("Invalid age")
        }
}
