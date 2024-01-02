package basic

import kotlin.math.PI
import kotlin.math.acos

class Functions

fun hello() {
    return println("Hello, world")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

// Named arguments
// Default parameter values
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// Functions without return
fun printMessage(message: String) {
    println(message)
}

fun plus(x: Int, y: Int) = x + y
// 아래와 동일
// fun plus(x: Int, y: Int): Int {
//     return x + y
// }

fun circleArea(radius: Int): Double = PI * radius * radius
//fun circleArea(radius: Int): Double {
//    return PI * radius * radius
//}

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}
fun main() {
    hello()

    println(sum(1, 2))

    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(message = "Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    printMessage("Hello")

    println(circleArea(2))

    println(uppercaseString("hello"))
    println({ string: String -> string.uppercase() }("hello") )

    val upperCaseString = { string: String -> string.uppercase() }
    val upperCaseString2: (String) -> String = { string -> string.uppercase() }
    println(upperCaseString("hello"))
    println(upperCaseString2("hello"))

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    println(tripled)

    println(toSeconds("hour")(1))

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")

    println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))
    println(listOf(1, 2, 3).fold(0){ x, item -> x + item })

    FunctionsPracice1()
    FunctionsPracice2()
}

fun FunctionsPracice1() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

fun FunctionsPracice2() {
    repeatN(5) {
        println("Hello")
    }
}