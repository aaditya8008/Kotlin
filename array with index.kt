import java.util.*

fun main() {
    val read = Scanner(System.`in`)

    println("Enter Size :\n")
    var size = read.nextInt()
    var arr = IntArray(size)
    

    println("Enter Array :\n")
    for (i in 0..size-1) {
        arr[i] = read.nextInt()
    }

    println("Array:\n")
    for ((i,e) in arr.withIndex()) {
        println("$i  $e" )
    }
}