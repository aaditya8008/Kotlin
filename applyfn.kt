fun main() {
    val emp = employee()
    emp.age = 20
    emp.name = "John"
    emp.apply {
        age = 30 // no need for emp.
        name = "Aadi"
    }
    println(emp)
}

data class employee(var name: String = "", var age: Int = 18)
