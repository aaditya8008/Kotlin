fun main(){
val circle:shape=circle(4.0)     //parent holds refrence to child
val square:shape=square(2.0)
println(circle.area())
println(square.area())
val shapes= arrayOf(circle(3.0),circle(4.0),square(4.0))
calculateareas(shapes) 
}
fun calculateareas(shapes:Array<shape>){
for(Shape:shape in shapes){
    println(Shape.area())
}
}
open class shape{
open fun area():Double{
    return 0.0
}
}
class circle(val radii:Double):shape(){
override fun area(): Double{
    return Math.PI*radii*radii
}

}
class square(val side:Double):shape(){
    override fun area(): Double{
        return side*side
    }
    
    }