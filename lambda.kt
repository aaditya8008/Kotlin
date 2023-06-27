fun main() {
    var fn: (a: Int, b: Int) -> Int = ::sum
    val lambda = { x: Int, y: Int -> x + y }
    val multilambda = {
        println("hELLO lAMBDA")
        val a = 2 + 3
        "Hello "
        2 // last line will be return rype
    }
    val singleparamlambda = { x: Int, y: Int -> x * y }
    val lambda2: (Int) -> Int = { x -> x * x }

    println(multilambda())
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int) {
    val result = op(a, b)
    println(result)
}
