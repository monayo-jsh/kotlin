package Classes.Extensions

class _Extension_Properties

private val <T> List<T>.lastIndex: Int
    get() = size - 1

private class MyClass {
    companion object {

    }
}

private fun MyClass.Companion.printCompanion() {
    println("companion")
}

fun main() {
    println(listOf(1, 2, 3).lastIndex)
    println(emptyList<Int>().lastIndex)

    MyClass.printCompanion()

    class Host(val hostname: String) {
        fun printHostname() {
            print(hostname)
        }
    }

    class Connection(val host: Host, val port: Int) {
        fun printPort() {
            print(port)
        }

        fun Host.printConnectionString() {
            printHostname() // calls Host.printHostname()
            print(":")
            printPort() // calls Connection.printPort()
        }

        fun connect() {
            host.printConnectionString()
        }

        fun Host.getConnectionString() {
            toString() // calls Host.toString()
            this@Connection.toString() // calls Connection.toString()
        }

        fun getConnectionString() {
            host.getConnectionString()
        }
    }

    val connection = Connection(Host("kotlin.in"), 443)
    connection.connect()
    connection.getConnectionString()

    println()

    open class Base
    class Derived : Base() { }

    open class BaseCaller {
        open fun Base.printFunctionInfo() {
            println("Base extension function in BaseCaller")
        }

        open fun Derived.printFunctionInfo() {
            println("Derived extension function in BaseCaller")
        }

        fun call(b: Base) {
            b.printFunctionInfo() // call the extension function
        }

    }

    open class DerivedCaller: BaseCaller() {
        override fun Base.printFunctionInfo() {
            println("Base extension function in DerivedCaller")
        }

        override fun Derived.printFunctionInfo() {
            println("Derived extension function in DerivedCaller")
        }
    }

    BaseCaller().call(Base())
    DerivedCaller().call(Base())
    DerivedCaller().call(Derived())
}