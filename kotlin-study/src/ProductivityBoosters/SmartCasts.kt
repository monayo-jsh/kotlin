package ProductivityBoosters

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

class SmartCasts

fun main() {

    //스마트 캐스트
    val date: ChronoLocalDate? = LocalDate.now()

    if (date != null) {
        println(date.isLeapYear)
    }

    //조건 내부의 스마트 캐스트
    if (date != null && date.isLeapYear) {
        println("It's a leap year!")
    }

    //조건 내부의 스마트 캐스트
    if (date == null || !date.isLeapYear) {
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {
        //하위 유형으로 스마트 캐스팅
        val month = date.monthValue
        println(month)
    }
}