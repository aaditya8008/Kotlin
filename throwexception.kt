fun main() {
    createuserlist(5)
    createuserlist(-1)
}

fun createuserlist(count: Int) {
    if (count < 0) {
        throw IllegalArgumentException("Count must be greater than 0")
        // throw message

    } else {
        println("$count users list created")
    }
}
