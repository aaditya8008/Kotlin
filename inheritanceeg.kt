fun main(){
val one=child()
one.mymethod()
one.mymethod2()
println(one.name)
println(one.name2)

}

open class parent{
    init{
        println("Parent Constructor")
    }
val name:String="Father"
fun mymethod(){
    println("I am parent")
}

}
class child:parent(){
    init{
        println("Child Constructor")
    }
    val name2:String="Son"
fun mymethod2(){
   println("I am child") 
}
}