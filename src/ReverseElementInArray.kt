//8.Write a function to reverese all the element in array

fun<T> swap(arr: Array<T?>, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

fun<T> reverse(arr: Array<T?>) {
    var low = 0
    var high = arr.size - 1
    while (low < high) {
        swap(arr, low, high)
        low++
        high--
    }
}

fun main(args:Array<String>) {
    val arr: Array<Int?> = arrayOf(1, 2, 3, 4, 5)
    reverse(arr)

    println(arr.contentToString())
}