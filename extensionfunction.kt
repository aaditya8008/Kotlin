fun main() {
    println("Hello India".formattedString())
}

fun String.formattedString(): String {
    return "=======\n$this\n======="
}
