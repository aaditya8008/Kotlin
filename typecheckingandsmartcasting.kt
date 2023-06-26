fun main() {
    val circle=Circle(4.0)
    val player=Player("Smiley")
    if(circle is Circle){               //typechecking
        println("This is Circle")
    }
    val arr=arrayOf(circle,player)
    for(i in arr){
        if(i is Circle){
            println(i.area())
        }
        else{
            (i as Player).saymyname()
        }
    }
}
interface Draggable {
    fun drag()
}

abstract class shape : Draggable { // same like classes but no bracket

    abstract fun area(): Double
}

class Circle(val radii: Double) : shape() {
    override fun area(): Double {
        return Math.PI * radii * radii
    }
    override fun drag() {
        println("Circle is Dragging")
    }
}



class Player(val name: String) : Draggable {
    override fun drag() = println("$name is dragging")
fun saymyname()=println("Hey my name id - $name")
}

