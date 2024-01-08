package Classes.Generic

class _Generic

private class Box<T>(t: T) {
    var value = t
}

private interface Source<out T> {
    fun nextT(): T
}

private interface Compartable<in T> {
    operator fun compareTo(ohter: T): Int
}

private class Array<T>(val size: Int) {
}

fun main() {
    val box: Box<Int> = Box(1)
    println(box.value)

    fun demo(strs: Source<String>) {
        val objects: Source<Any> = strs
    }

    fun demo2(x: Compartable<Number>) {
        x.compareTo(1.0)

        val y: Compartable<Double> = x
    }

}