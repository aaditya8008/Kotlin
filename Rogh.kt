import java.util.*

fun main() {
    val p1 = Person("Aditya", 18)
    val p2 = Person("Mom", 19)
    println(p1.canvote())
    println(p2.canvote())
    p1.age = 73
    println(p1.canvote())
}

class Person(val name: String, var age: Int) {
    fun canvote(): Boolean {
        return age > 18
    }
}
