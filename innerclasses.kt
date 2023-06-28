fun main() {
    var x = outer()
    x.i

    val inner = outer().nested() // also object o oyter
}

class outer {
    var i = 0
    inner class nested { // to access outter i
        fun test() {
            println("Passed\n")
        }
    }
}
