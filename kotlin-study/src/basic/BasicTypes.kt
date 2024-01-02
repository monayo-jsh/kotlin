package basic

class BasicTypes

fun main() {
    // Variable declared without initialization
    val d: Int
    // Variable 'd' must be initialized
    // println("d: $d")

    // Variable initialize
    d = 3

    println("d: $d")

    // Variable  typed and initialized
    val e: String = "hello"

    // Variables can be read because they have been initialized
    println("e: $e")

    practiceBasicTypes()
}

fun practiceBasicTypes() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}