package Classes

class _Funcational_Interface

private fun interface KRunnable {
    fun invoke()
}

private fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

private interface Printer {
    fun print()
}

private fun Printer(block: () -> Unit): Printer = object : Printer {
    override fun print() {
        block()
    }
}

private fun interface PrinterA {
    @Deprecated(message = "Your message about the deprecation", level = DeprecationLevel.HIDDEN)
    fun print()
}

typealias LongPredicate = (i: Int) -> Boolean

fun main() {

    val isEven = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }

    val isEvent2 = IntPredicate { it % 2 == 0 }

    println(isEven.accept(2))
    println(isEvent2.accept(2))

    println(::PrinterA)

    val isEven3: LongPredicate = { it % 2 == 0}
    println(isEven3(2))
}