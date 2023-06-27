fun main() {
    val num = listOf(1, 2, 3, 4, 5)
    println(odd(3))
    println(odd(2))
    val list = num.filter(::odd) // checks on loop by calling
    println(list)
    val list2 =
            num.filter(
                    fun(a: Int): Boolean { // direct
                        return a % 2 == 0
                    }
            ) // checks on loop
    println(list2)

    val list3 = num.filter({ a: Int -> a % 2 == 0 }) // by lambda
    println(list3)
}

fun odd(a: Int): Boolean {
    return a % 2 != 0
}
