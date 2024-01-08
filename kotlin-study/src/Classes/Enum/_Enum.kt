package Classes.Enum

import Classes.EnumClass
import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

class _Enum

private enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

private enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

private enum class PorotocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): PorotocolState
}

private enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int): Int = apply(t, u)
}

private inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString { it.name })
}

fun main() {

    for (color in Color.entries) {
        println(color.toString())
        println("첫번째 색상은: ${Color.valueOf("RED")}")
    }

    println()

    println(Color.RED.name)
    println(Color.RED.ordinal)

    println()

    printAllValues<Color>()
}