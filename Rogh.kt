fun main(){
calculatetimeandrun {
    loop(1000000)
}
}
fun calculatetimeandrun(fn:()->Unit){
    val start =System.currentTimeMillis()
    fn()
    val end =System.currentTimeMillis()
    println("time taken "+(end - start) +"ms")
}
fun loop(n: Long){
    for(i in 1..n){
    //
    }
}