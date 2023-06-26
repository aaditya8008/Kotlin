fun main() {}

open class A { // public
    public var a = 10
    private var b = 20 // only this class
    internal var c = 30
    protected var d = 40 // sub classes
}

class B : A() {
    fun test() {
        println(a)
        println(b)
        println(c)
        println(d)
    }
}
