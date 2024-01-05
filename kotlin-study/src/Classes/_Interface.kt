package Classes

class _Interface

private interface MyInterface {
    val prop: Int // abstract

    val propertWithImplementation: String
        get() = "foo"

    fun bar()
    fun foo() {
        // optional body
        println("foo() : $propertWithImplementation")
    }
}

private class Child : MyInterface {
    override val prop: Int = 29

    override fun bar() {
        // implementation
        println("bar()")
    }
}

private interface Named {
    val name: String
}

private interface Person1 : Named {
    val firstName: String
    val lastName: String

    override val name: String
        get() = "$firstName $lastName"
}

private data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: String) : Person1

private interface A {
    fun foo() {
        println("A")
    }
    fun bar()
}

private interface B {
    fun foo() {
        println("B")
    }
    fun bar() {
        println("bar")
    }
}

private class C : A {
    override fun bar() {
        println("bar")
    }
}

private class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }

}

fun main() {
    val child = Child()
        child.bar()
        child.foo()

    println(child.prop)

    val employee = Employee("JU", "SANGHYUN", "position")
    println(employee.name)

    val c = C()
    c.foo()
    c.bar()

    val d = D()
    d.foo()
    d.bar()
}