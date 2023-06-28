fun main() {
    var x = outer()
    x.i
    val nested = outer.nested()  // or outer.nested().test()
    nested.test()
}

class outer {
    var i = 0
    class nested {
        fun test() {
            println("Passed\n")
        }
    }
}
