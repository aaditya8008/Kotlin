fun main() {
    val p1 = person(1, "John")
    val p2 = person(1, "John")
    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)
    val t1 = test()
    val t2 = test()
    println(t1)
    println(t2)
    println(t1.hashCode())
    println(t1 == t2)

    val p3 = p1.copy(id = 3)
    println(p3)
    val (id, name) = p1
    println(id)
    println(name)
    println(p1.component1())
}

data class person(val id: Int, val name: String) { // compares data
}

class test() { // compares object to which they are pointing which have different address
}
