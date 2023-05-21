fun main() {
    var i = 0
    while (i < 10) {
        println(i)
        i++
    }
    i = 0
    do {
        println(i)
        i++
    } while (i < 10)

    println("From 1")
    for (i in 1..10 step 2) {
        println("2 * " + i + "=" + (2 * i))
    }
    var x = 2
    println("From 10")
    i = 10
    for (i in 10 downTo 1 step 3) {
        // String templating
        println("$x * $i= ${i * x}")
    }
    println("From 1")
    for (i in 1 until 10 step 3) {
        println("2 * " + i.toString() + "=" + (2 * i).toString())
    }
}
