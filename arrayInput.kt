import java.util.Scanner
fun main(){
val arr=arrayOfNulls<Int>(10)
val read=Scanner(System.`in`)
for(i in 0 until 10){
arr[i]=read.nextInt()
}
for(i in 0 until 10){
    print(arr[i])
    }
    print(arr.size)
}
