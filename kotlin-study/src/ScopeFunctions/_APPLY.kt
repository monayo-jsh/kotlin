package ScopeFunctions

class _APPLY

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val jake = Person()
    println(jake)

    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()

    println(jake)
    println(stringDescription)
}