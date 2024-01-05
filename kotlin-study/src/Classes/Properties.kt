package Classes

class Properties

private class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

private fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    return result
}

private class Rectangcle(val width: Int, val height: Int) {
    val area: Int
        get() = this.width * this.height
    var stringRepresentation: String = "height"
        set(value) {
            field = setDataFormString(value)
        }

    fun setDataFormString(value: String): String {
        return "$value***"
    }

    var setterVisibility: String = "abc"
        private set

    val isEmpty: Boolean
        get() = this.area == 0

    private var _table: Map<String, Int>? = null
    public val table:Map<String, Int>
        get() {
            if (_table == null)
                _table = HashMap()

            return _table ?: throw AssertionError("Set to null by another")
        }
}

private object CONSTANT {
    const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

    @Deprecated(SUBSYSTEM_DEPRECATED) fun foo() {
        println("foo foo foo")
    }
}

fun main() {
    copyAddress(Address())

    val rectangcle = Rectangcle(10, 10)
    println(rectangcle.area)

    rectangcle.stringRepresentation = "test"
    println(rectangcle.stringRepresentation)

    //rectangcle.setterVisibility = "xx"

    CONSTANT.foo()
}