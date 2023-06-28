fun main() {
    calculatetimeandrun { loop(100000) }
}

inline fun calculatetimeandrun(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("time taken ${end - start} ms")
}

fun loop(n: Long) {
    for (i in 1..n) {
        //
    }
}
