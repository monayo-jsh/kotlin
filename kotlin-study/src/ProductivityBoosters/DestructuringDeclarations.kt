package ProductivityBoosters

class DestructuringDeclarations

fun practice1() {
    // 왼쪽의 변수 개수는 오른쪽의 인수 개수와 동일
    val (x, y, z) = arrayOf(5, 10, 15)
    println(x)
    println(y)
    println(z)

    val map = mapOf("Alice" to 21, "Bob" to 25)

    // key, value -> name, age 매핑
    for ((name, age) in map) {
        println("$name is $age years old.")
    }

    fun findMinMax(list: List<Int>): Pair<Int, Int> {
        return Pair(50, 100)
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))
    println(min)
    println(max)
}

data class User(val username: String, val email: String)

fun getUser() = User("Mary", "mary@somewhere.com")

class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

fun main() {
    practice1()

    val user = getUser()
    val (username, email) = user
    println(username == user.component1())
    println("$username $email")

    //필요하지 않은 값은 밑줄을 사용하여 사용되지 않는 변수 표현
    val (_, emailAddress) = getUser()
    println(emailAddress)

    val (num, name) = Pair(1, "one")
    println("num = $num, name = $name")
}