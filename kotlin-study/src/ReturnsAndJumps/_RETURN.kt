package ReturnsAndJumps

class _RETURN

fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        print(it)
    }
    println("this point is unreachable")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach lit@ {
        if (it == 3) return@lit
        print(it)
    }
    println(" done with explicit label")
}

fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        print(it)
    }
    println(" done with explicit label")
}

fun foo4() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return
        print(value)
    })
    println(" done with explicit label")
}

fun foo5() {
    val result = run loop@ {
        listOf(1,2,3,4,5).forEach {
            if (it == 3) return@loop 100
            print(it)
        }
    }
    println(" done with nested loop, result: $result")
}

fun main() {

    foo1()
    println()

    foo2()

    foo3()

    foo4()

    foo5()
}