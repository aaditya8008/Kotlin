fun main() {
    myclass.f()
    myclass.another.g()
}

class myclass {                 //one companion in one class
    companion object myobject { // no need for object name during referance
        fun f() {
            println("HElloo!!")
        }
    }
    object another {
        fun g() {
            println("galloo!!")
        }
    }
}
