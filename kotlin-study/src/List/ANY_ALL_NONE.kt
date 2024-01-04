package List

class ANY_ALL_NONE

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    practiceAny(numbers)
    practiceAll(numbers)
    practiceNone(numbers)
}

fun practiceAny(numbers: List<Int>) {
    // any
    // 주어진 조건자와 일치하는 요소가 하나 이상 포함되어 있으면 true

    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }

    println(anyNegative)
    println(anyGT6)
}

fun practiceAll(numbers: List<Int>) {
    // all
    // 모든 요소가 주어진 조건자와 일치하면 true

    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }

    println(allEven)
    println(allLess6)
}

fun practiceNone(numbers: List<Int>) {
    // none
    // 주어진 조건자와 일치하는 요소가 없으면 true

    val allEven = numbers.none { it % 2 == 1 }
    val allLess6 = numbers.none { it < 6 }

    println(allEven)
    println(allLess6)
}