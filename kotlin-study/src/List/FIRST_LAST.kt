package List

class FIRST_LAST

fun main() {
    practiceFirstLast()
    practiceFirstOrNullLastOrNull()
}

fun practiceFirstLast() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }

    println(first)
    println(last)

    println(firstEven)
    println(lastOdd)
}

fun practiceFirstOrNullLastOrNull() {
    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val first = empty.firstOrNull()
    val last = empty.lastOrNull()

    println(first)
    println(last)

    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.firstOrNull { it.startsWith('z') }

    println(firstF)
    println(firstZ)

    val lastF = words.lastOrNull { it.endsWith('f') }
    val lastZ = words.lastOrNull { it.endsWith('z') }

    println(lastF)
    println(lastZ)
}