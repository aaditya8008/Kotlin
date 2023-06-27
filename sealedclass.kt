fun main() {
    val tile = red("Mushroom", 25)
    val tile2 = red("Fire", 24)
    println("($tile.points) - $(tile.type)")
}

sealed class tile

class red(val type: String, val points: Int) : tile()

class blue(val points: Int) : tile()
