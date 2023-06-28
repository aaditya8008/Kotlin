fun main() {
    val emp: employee? = null

    emp?.age = 20 // for non-null
    emp?.name = "John"
    emp?.let { // all are non-null
        it.age = 20
        it.name = "Aadi"
    }
}

data class employee(var name: String = "", var age: Int = 18)
