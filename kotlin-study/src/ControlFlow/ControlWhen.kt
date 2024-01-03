package ControlFlow

class ControlWhen

fun main() {
    practiceWhen()
    practiceWhenExpression()
}

fun practiceWhen() {
    fun cases(obj: Any) {
        // is 는 유형 검사
        when(obj) {
            1 -> println("One")
            "Hello" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a string")
            else -> println("Unknown")
        }
    }

    cases("Hello")
    cases(1)
    cases(0L)
    cases(ControlWhen())
    cases("hello")
}

fun practiceWhenExpression() {

    fun whenAssign(obj: Any): Any {
        val result = when (obj) {
            1 -> "one"
            "Hello" -> 1
            is Long -> false
            else -> 42
        }
        return result
    }

    println(whenAssign("Hello"))
    println(whenAssign(3L))
    println(whenAssign(1))
    println(whenAssign(ControlWhen()))
}