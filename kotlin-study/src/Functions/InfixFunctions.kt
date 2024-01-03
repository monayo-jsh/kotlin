package Functions

class InfixFunctions

fun main() {
    practiceInfix()
    practiceOperator()
    practiceVararg()
}

fun practiceInfix() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia

    sophia.likedPeople.forEach { person -> println(person.name) }
    claudia.likedPeople.forEach { person -> println(person.name) }
}

class Person(val name:String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }
}

fun practiceOperator() {

    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}

fun practiceVararg() {
    //vararg -> 쉼표로 구분하여 여러 인수를 전달
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }

    printAll("Hello", "Hallo", "Salut", "Hola", "Hi")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "Hi", prefix = "Greeting: ")

    fun log(vararg entries: String) {
        printAll(*entries)
    }

    log("Hello", "Hallo", "Salut", "Hola", "Hi")
}