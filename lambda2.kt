fun main() {
    calculator(1, 2) { a: Int, b: Int -> a + b }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int) {
    val result = op(a, b)
    println(result)
}
