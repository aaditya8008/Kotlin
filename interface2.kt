fun main() {
    dragall(arrayOf(circle(4.0), square(4.0), triangle(2.0, 4.0), player("Smiley")))
}

fun dragall(array: Array<Draggable>) {
    for (i in array) {
        println(i.drag())
    }
}

interface Draggable {
    fun drag()
}

abstract class shape : Draggable { // same like classes but no bracket

    abstract fun area(): Double
}

class circle(val radii: Double) : shape() {
    override fun area(): Double {
        return Math.PI * radii * radii
    }
    override fun drag() {
        println("Circle is Dragging")
    }
}

class square(val side: Double) : shape() {
    override fun area(): Double {
        return side * side
    }
    override fun drag() {
        println("square is Dragging")
    }
}

class triangle(val base: Double, val height: Double) : shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
    override fun drag() {
        println("Triangleis Dragging")
    }
}

class player(val name: String) : Draggable {
    override fun drag() = println("$name is dragging")
}
