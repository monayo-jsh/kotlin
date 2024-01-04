package List

class ZIP

fun main() {

    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    val resultPairs = A zip B
    println(resultPairs)

    val resultReduce = A.zip(B) { a, b -> "$a$b"}
    println(resultReduce)

}