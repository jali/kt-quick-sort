# quickSort-Kotlin
QuickSort in Kotlin using tail recursion


```
fun main(args: Array<String>) {
	val l = randomizeList(10)
    println("randomized list of 10: $l")

    val p: Int = l.first()
    println("pivot is: $p")

    val res = partition(l, p)
    println("Result: $res")

    val sorted = quickSort(l)
    println("Sorted: $sorted")
}
```