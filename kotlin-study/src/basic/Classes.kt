package basic

import kotlin.random.Random

class Classes

class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"

    fun printId() {
        println(id)
    }
}

data class User(val name: String, val id: Int)

data class Employee(val name: String, var salary: Int)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    println(contact.id)
    println(contact.email)

    contact.email = "jane@gmail.com"
    println(contact.email)

    contact.printId()

    val user = User(name = "Alex", id = 1)
    val secondUser = User(name = "Alex", id = 1)
    val thirdUser = User(name = "Max", 2)
    println(user)

    // Compares user to second user
    println("user == secondUser: ${user == secondUser}")

    // Compares user to third user
    println("user == thirdUser: ${user == thirdUser}")

    // Creates an exact copy of user
    println(user.copy())

    // Creates a copy of user with name: "Max"
    println(user.copy(name = "Max"))

    // Creates a copy of user with id: 3
    println(user.copy(id = 3))

    classesPractice1()
    classesPractice2()
}

fun classesPractice1() {
    val emp = Employee2("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}

data class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    private val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

    fun generateEmployee(): Employee2 {
        val salary = Random.nextInt(minSalary, maxSalary)

        return Employee2(name = names.random(), salary = salary)
    }
}

fun classesPractice2() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}