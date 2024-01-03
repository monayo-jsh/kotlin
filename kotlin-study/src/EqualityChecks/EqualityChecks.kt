package EqualityChecks

class EqualityChecks

// == 구조적 비교 (동등성: 객체가 참조하는 주소값)
// === 참조 비교 (동일성: 객체가 가지는 정보)

// a == b 는 if (a == null) b == bull else a.equals(b)

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers)
}