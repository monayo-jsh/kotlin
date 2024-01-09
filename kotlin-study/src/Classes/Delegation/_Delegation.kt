package Classes.Delegation

class _Delegation

private interface Base {
    fun print()
}

private class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }
}

private class Derived(b: Base) : Base by b

private interface Base2 {
    fun printMessage()
    fun printMessageLine()
}

private class Base2Impl(val x: Int) : Base2 {
    override fun printMessage() {
        print(x)
    }

    override fun printMessageLine() {
        println(x)
    }
}

private class Derived2(b : Base2) : Base2 by b {
    override fun printMessage() {
        print("abc")
    }
}

private interface Base3 {
    val message: String
    fun print()
}

private class Base3Impl(val x: Int) : Base3 {
    override val message: String = "Base3Impl: x = $x"

    override fun print() {
        println(message)
    }
}

private class Derived3(b: Base3) : Base3 by b {
    override val message: String = "Message of Derived3"
}

fun main() {
    val b = BaseImpl(10)
    b.print()

    Derived(b).print()

    val bb = Base2Impl(100)
    Derived2(bb).printMessage()
    Derived2(bb).printMessageLine()

    val bbb = Base3Impl(1000)
    val derived3 = Derived3(bbb)
    derived3.print()
    println(derived3.message)
}