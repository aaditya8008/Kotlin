

fun main(){
    var car=automobile("car",4,5)
    var person=emptyconstruct("Yo",73)
    println(person.age)
    println(person.name)

}

class automobile(val name:String,val tyres:Int,val maxseating:Int){
fun drive(){}
fun applybrakes(){}

}
class noconctruct{}
class emptyconstruct(namee:String,agee:Int){
    val name:String=namee
    var age:Int=agee
}