//1. Write a function to find largest of three numbers.
fun main(args: Array<String>) {
    val n1 = 5
    val n2 = 4
    val n3 = 2
    largNumber(n1,n2,n3)

}
fun largNumber(n1:Int,n2:Int,n3:Int){
    if(n1==n2 &&n2==n3)
        println(" All the Number are equal number.")
    else if (n1 >= n2 && n1 >= n3) {
        println("$n1 is the largest number.")
    } else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number.")
    else
        println("$n3 is the largest number.")
}