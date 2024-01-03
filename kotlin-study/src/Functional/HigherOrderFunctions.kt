package Functional

class HigherOrderFunctions

// Higher-Order Functions (고차 함수)
// 다른 함수를 매개변수로 사용하거나 함수를 반환하는 함수
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    //함수를 참조하는 기법 ::functionName
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }

    println("sumResult: $sumResult, mulResult: $mulResult")

    val func = operation()
    println(func(2))
}