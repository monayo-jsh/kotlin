package Classes.Nested

class Nested

private class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
    inner class Inner {
        fun foo() = bar
    }
}

private interface OuterInterface {
    class InnerClass
    interface InnerInterface
}

private class OuterClass {
    class InterClass
    interface InnerInterface
}

fun main() {

    val demo = Outer.Nested().foo()
    println(demo) // 2

    val inner = Outer().Inner().foo()
    println(inner)

}