import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println("Enter numbers")
    val x = read.nextInt()
    val y = read.nextInt()
    println(product(x, y))
    println("Odd or Even : ${oddeven(x)}")
}

fun product(num1: Int, num2: Int): Int {

    return (num1 * num2)
}

fun oddeven(x: Int): String {
    if (x % 2 == 0) return "Even" else return ("Odd")
}
