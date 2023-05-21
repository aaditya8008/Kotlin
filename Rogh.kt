import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println("Enter numbers")
    val x = read.nextFloat()
    val y = read.nextFloat()
    println(product(x, y))
    println("Odd or Even : ${oddeven(3)}")


    product(num2=y,num1=x)
    println(product(x, y))
}

fun product(num1: Int, num2: Int): Int {

    return (num1 * num2) // function overloading
}

fun product(num1: Float, num2: Float): Float {
    return (num1 * num2)
}

fun oddeven(x: Int): String {
    if (x % 2 == 0) return "Even" else return ("Odd")
}
