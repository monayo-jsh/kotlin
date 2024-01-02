package basic

class Variables

fun main() {
    println("val 는 읽기 전용 변수")
    val popcorn = 5
    val hotdog = 7
    println("popcorn: " + popcorn)
    println("hotdog: " + hotdog)

    println()

    println("var 는 변경 가능한 변수")
    var customer = 10
    println("customer: " + customer)
    customer = 8
    println("customer: " + customer)
}