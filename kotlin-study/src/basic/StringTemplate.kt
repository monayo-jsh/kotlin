package basic

class StringTemplate

fun main() {
    val customer = 10

    println("$customer 명의 고객이 있습니다.")

    println("${customer}명의 고객이 있습니다.")

    println("${customer + 1}명의 고객이 있습니다.")

    practiceStringTemplate()
}

fun practiceStringTemplate() {
    val name = "Mary"
    val age = 20

    println("$name is $age years old")
}