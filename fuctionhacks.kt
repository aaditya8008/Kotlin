import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println("Enter numbers")
    val x = read.nextFloat()
    val y = read.nextFloat()
    println(product(num2 = x, num1 = y)) // can do in different sequence
    var yo: (a: Float, b: Float) -> Float = ::product
    println(yo(x, y))
    val j = read.nextInt()
    var o = ::oddeven
    println(o(j))
}

fun product(num1: Int = 2, num2: Int): Int { // default value

    return (num1 * num2) // function overloading
}

fun product(num1: Float, num2: Float): Float = (num1 * num2) // one line function

fun oddeven(x: Int): String {
    if (x % 2 == 0) return "Even" else return ("Odd")
}
