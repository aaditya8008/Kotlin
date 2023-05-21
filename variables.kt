fun main() {
    var score = 5 // automatically assign datatype(type inference)
    score = 6.0 // can't as it is to type int(type checking)
    println("Score is=" + score)
    score = 10 // var can be reassigned
    println("Score is=" + score)
    val points = 10 // error as can't be re-assigned
    println("points are=" + points)
}
