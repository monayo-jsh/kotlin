package Classes.Extensions

class _Extension

fun main() {
    // Extension Function
    //private fun MutableList<Int>.swap(index1: Int, index2: Int) {
    fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val tmp = this[index1] // 'this' corresponds to the list
        this[index1] = this[index2]
        this[index2] = tmp
    }

    val list = mutableListOf(1, 2, 3, 4)
    list.swap(0, 2).also { list.forEach { println(it) } }



    open class Shape
    class Rectangle : Shape()

    fun Shape.getName() = "Shape"
    fun Rectangle.getName() = "Rectangle"

    fun printClassName(s: Shape) {
        println(s.getName())
    }

    printClassName(Shape())
    printClassName(Rectangle())

    class Example1 {
        fun printFunctionType() {
            println("Class Method")
        }
    }

    fun Example1.printFunctionType() {
        println("Extension function")
    }

    // Class Method
    Example1().printFunctionType()

    class Example2 {
        fun printFunctionType() {
            println("Class Method")
        }
    }

    fun Example2.printFunctionType(i: Int) {
        println("Extension function $i")
    }

    // overload possible
    Example2().printFunctionType(1)

    fun Any?.toCustomString(): String {
        if (this == null) return "null"

        return toString()
    }

    println(null.toCustomString())
    println("X".toCustomString())
    println(1.toCustomString())
}