fun main() {
    println(sum(2.0, 3.0))

    var fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(6.0, 7.0))
    calculator(5.0, 6.0, ::sum) // passing a function
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}
