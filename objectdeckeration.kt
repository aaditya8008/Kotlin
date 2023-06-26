fun main() {
    println(A.num)
    println(b.test())
}

object A {
    val num: Int = 10
}

object b {
    val g: Int = 20
    fun test() {
        println("Iam object B")
    }
}
