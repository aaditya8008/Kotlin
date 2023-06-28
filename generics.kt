fun main() {
    val obj = intcontainer(3)
    obj.getValue()
    val i = container(3) // any type
    i.getValue()
    val s = container("AADI") // any type
    println(s.getValue())
}

class container<T>(var data: T) { // any data for same class

    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }
}

class intcontainer(var data: Int) {
    fun setValue(value: Int) {
        data = value
    }

    fun getValue(): Int {
        return data
    }
}

class stringcstringainer(var data: String) {
    fun setValue(value: String) {
        data = value
    }

    fun getValue(): String {
        return data
    }
}
