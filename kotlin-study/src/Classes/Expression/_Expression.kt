package Classes.Expression

class _Expression

private open class A(x: Int) {
    open val y: Int = x
}

private interface B

private val ab: A = object : A(1), B {
    override val y: Int = 15
}

private class C {
    private fun getObject() = object {
        val x: String = "x"
    }

    fun printX() {
        println(getObject().x)
    }
}

private interface AA {
    fun funFromA() {}
}

private interface BB

private class CC {
    fun getObject() = object {
        val x: String = "x"
    }
    
    fun getObjectA() = object : AA {
        override fun funFromA() {}
        val x: String = "x"
    }
    
    fun getObjectB(): BB = object : AA, BB {
        override fun funFromA() {}
        val x: String = "x"
    }
}

private class DataProvider

private object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {

    }

    val allDataProviders: Collection<DataProvider>
        get() = emptyList()
}

private object DataObject

private data object MyDataObject {
    val x: Int = 3
}

fun main() {
    val helloWorld = object {
        val hello = "Hello"
        val world = "World"

        override fun toString(): String = "$hello $world"
    }

    println(helloWorld)

    println(MyDataObject.x)
}