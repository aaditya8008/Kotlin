fun main(){
var arr=arrayOf("one","two","three")
var arr1=arrayOf(1,2,3)               //implicit
var arr2=arrayOf<Int>(3,2,1)      //explicit
for(i in arr){
    println(i)
}
for(i in arr1)
{
    println(i)
}
for((i,e) in arr2.withIndex())
{
    println("$i  $e")
}
println(arr[0])
println(arr.get(1))
arr.set(0,"HELLOOOO")
println(arr[0])
println(arr.size)

}
