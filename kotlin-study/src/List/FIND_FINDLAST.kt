package List

class FIND_FINDLAST

fun main() {
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }
    val nothing = words.find { it.contains("nothing") }

    println(first)
    println(last)
    println(nothing)
}