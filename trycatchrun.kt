fun main() {
    val arr = arrayOf(1, 2, 3)
    try {
        println(arr[5]) // error detection
    } 
    
    catch (e: Exception) {
        println("Re-check Index") // if error occurs
    } 
    
    finally {
        println("I am inevitable") // always
    }

    println("This will not run!!") // also runs
}