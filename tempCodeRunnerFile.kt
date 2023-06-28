fun main() {
    val emp = employee()
    emp.age = 20
    emp.name = "John"
    println(emp.age)
    println(emp.name)

    emp.let { // it will be used
        println(it.name)
        println(it.age)
    }
    var x =
            emp.let { // it will be used
                println(it.name)
                println(it.age)

                5 // return value
            }
}

data class employee(var name: String = "", var age: Int = 18)