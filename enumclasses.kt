fun main() {
    val Day = day.Monday // assigned monday
    println(Day)
    println(Day.num)

    for (i in day.values()) {
        println(i)
    }
    Day.printformatedday()
}

enum class day(val num: Int) { // given value can be assigned
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
     Friday(6),
    Saturday(7);
    fun printformatedday() {
        println("Day is $this")
    }
}
