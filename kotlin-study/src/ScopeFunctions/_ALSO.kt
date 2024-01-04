package ScopeFunctions

class _ALSO

fun writeCreatingLog(person: Person) {
    println("A new person ${person.name} was created.")
}

fun main() {
    val jake = Person("Jake", 30, "Android Developer")
        .also {
            writeCreatingLog(it)
        }
}