fun main() {
    var gender: String = "Male"
    var gender2: String? = null // nullable
    var isadult: Boolean? = true

    if (gender2 != null) {
        println(gender2.uppercase())
    }
    println(gender2?.uppercase())

    gender2?.Let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }

    var selectedvalue = gender2 ?: "NA" // true for null
    var value = gender2!!.uppercase() // true for non null else error
}
