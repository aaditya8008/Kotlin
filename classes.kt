fun main(){
val mustang=Car("mustang","petrol",100,10)
val beetle=Car("beetle","diesel",200,10)
println(mustang.name)
println(mustang.type)
println(beetle.name)
println(beetle.type)
println(mustang.drivecar())
println(mustang.decide())
mustang.age=22
println(mustang.decide())
}
//classes
class Car(val name:String,val type:String,var kmRan :Int,var age: Int){ 
//methods
fun drivecar(){
    println("car")
}
fun brakes(){
    println("Apply breaks")
}
fun decide(){
    if(age>21)
    println("Can drive")
    else
    println("Can't drive")
}
}