fun main() {
    var score = 5 // automatically assign datatype(type inference)

    println("Score is=" + score)
    score = 10 // var can be reassigned
    println("Score is=" + score)
    val points = 10 // error as can't be re-assigned
    println("points are=" + points)

    var i: Int = 12 // explicitaly
    var j: Double = 89.4
    var k: Boolean = false
    var s: String = "Hello world"
    var c: Char = 'A'
    var str = "Hello"

    println(i)
    println(j)
    println(k)
    println(s)
    println(c)
    println(str)
}
