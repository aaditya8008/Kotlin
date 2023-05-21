fun main() {
    val above70 = true
    val knowprog = false
    val action = above70 && knowprog
    println("Called for highest package = " + action)
    println("Called for job = " + (above70 || knowprog))
var i=10
var j=11

    var result= i==10||j++==11   //as i true j not affected
    println(i)
    println(j)

    i=10
    j=11
     result= i==11||j++==11      //as i false j affected
     println(i)
     println(j)}
