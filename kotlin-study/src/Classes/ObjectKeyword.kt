package Classes

import java.util.Random

class ObjectKeyword

class LuckDispatcher {
    fun getNumber() {
        val objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    //singleton -> 객체가 실제로 생성되는 시점은 함수가 호출될 때
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $total")
}

//singleton -> object
object DoAuth {
    fun taskParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

//campanion object 동반 객체 -> Java 정적 메서드와 유사
class BigBen {
    // 이름 생략 가능
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    rentPrice(10, 2, 1)

    //객체가 실제로 생성되는 때
    DoAuth.taskParams("foo", "qwerty")

    //클래스 이름을 통해 동반 객체(companion object) 메서드를 호출
    BigBen.getBongs(12)
}