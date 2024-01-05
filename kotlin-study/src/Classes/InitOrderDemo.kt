package Classes

private class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

private class Customer(name: String) {
    val customerKey = name.uppercase()
}

//보조 생성자 작성
private class Person(val pets: MutableList<Pet> = mutableListOf())
private class Pet {
    constructor(owner: Person) {
        owner.pets.add(this)
    }
}

private class Person2(val name: String) {
    val children: MutableList<Person2> = mutableListOf()
    constructor(name: String, parent: Person2) : this(name) {
        parent.children.add(this)
    }
}

private class Constructors() {
    init {
        println("init block")
    }

    constructor(i: Int) : this() {
        println("Constructor $i")
    }
}

private class DontCreateMe private constructor() {

    constructor(i: Int) : this() {
        println("init $i")
    }
}

fun main() {
    val init = InitOrderDemo("test")
    val constructors = Constructors(100)
    val dontCreateMe = DontCreateMe(10)
}