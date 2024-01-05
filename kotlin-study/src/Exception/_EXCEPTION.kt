package Exception

class _EXCEPTION

data class Person(val name: String?) {
    constructor() : this(null)
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {

    try {
        throw Exception("Hi Kotlin !")
    } catch (e: Exception) {
        println("$e")
    }

    val input: String = "string"
    val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }
    println(a)

    try {
        val person = Person()
        val s = person.name ?: fail("Name required")
        println(s)
    } catch (e: IllegalArgumentException) {
        println("$e")
    }

    val x = null
    println(x is Nothing?)
    val l = listOf(null)
    println(l is List<Nothing?>)
}