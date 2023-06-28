fun main() {
    val emp: employee = employee()

    emp.age = 20 // for non-null
    emp.name = "John"
    emp.let { // all are non-null
        it.age = 20
        it.name = "Aadi"
    }
    with(emp) {
        age = 30

        name = "XYZ"

        2
        "abc" // return value
    }

    emp.run {
        age = 35
        name = "Yooo!!"
    }
}

data class employee(var name: String = "", var age: Int = 18)
