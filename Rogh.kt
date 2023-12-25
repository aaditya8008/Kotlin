fun main(){
val x=listOf(1,2,3,4,5,6)
val y=x.filter(::odd)
print(y)
}
fun odd(x: Int): Boolean {
return (x%2!=0)
}