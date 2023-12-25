fun main() {
    add(1, 2, 3, 4, 5, 6, 7)
}

fun add(vararg values: Int) { // values will be array
    var sum = 0
    for (i in values) {
        sum += i
    }
    println(sum)
}
