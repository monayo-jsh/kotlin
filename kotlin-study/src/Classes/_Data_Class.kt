package Classes

class _Data_Class

private data class PersonA(val name: String) {
    var age: Int = 0
}

fun main() {
    val person1 = PersonA("John")
    val person2 = PersonA("John")
    person1.age = 10
    person2.age = 20

    println("person1 == person2: ${person1 == person2}")

    println("나이 ${person1.age}인 person1: $person1")
    println("나이 ${person2.age}인 person2: $person2")

    data class UserA(val name: String, val age: Int) {
        // copy implementation
        //fun copy(name: String = this.name, age: Int = this.age) = UserA(name, age)
    }

    val jack = UserA("Jack", 1)
    val olderJack = jack.copy(age = 2)

    println(jack.age)
    println(olderJack.age)

    val (name, age) = UserA("Jane", 35)
    println("$name, $age years of age")

}