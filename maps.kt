fun main() {
    val students = mutableMapOf<Int, String>()
    students.put(1, "Ryan")
    students.put(2, "John")
    students.put(3, "Katie")
    println(students.get(2))
    for ((key, value) in students) {
        println("$key - $value")
    }
    students[8] = "Jones"
    println(students[8])
    val map2 = mapOf(1 to "Hello", 2 to "World")
    println(map2)
}