package Classes.Inline

class _InlineValueClasses

//inline value class
@JvmInline
private value class Password(private val s: String)

@JvmInline
private value class Person(private val fullName: String) {

    init {
        require(fullName.isNotEmpty()) {
            "Full name shouldn't be empty"
        }
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        require(lastName.isNotBlank()) {
            "Last name shouldn't be empty"
        }
    }

    val length: Int
        get() = fullName.length

    fun greet() {
        println("Hello, $fullName")
    }
}

private interface Printable {
    fun prettyPrint(): String
}

@JvmInline
private value class Name(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}

private interface I

@JvmInline
private value class Foo(val i: Int) : I

fun main() {
    val securePassword = Password("Don't try this in production")
    println(securePassword)

    val name1 = Person("Kotlin", "Mascot")
    val name2 = Person("Kodee")

    name1.greet()
    println(name1.length)
    name2.greet()
    println(name2.length)

    val name = Name("Kotlin")
    println(name.prettyPrint())


    fun asInline(f: Foo) {
        println(f)
    }
    fun <T> asGeneric(x: T) {
        println(x)
    }
    fun asInterface(i: I) {
        println(i)
    }
    fun asNullable(i: Foo?) {
        println(i)
    }

    fun <T> id(x: T): T = x

    val f = Foo(42)

    asInline(f)    // unboxed: used as Foo itself
    asGeneric(f)   // boxed: used as generic type T
    asInterface(f) // boxed: used as type I
    asNullable(f)  // boxed: used as Foo?, which is different from Foo

    // below, 'f' first is boxed (while being passed to 'id') and then unboxed (when returned from 'id')
    // In the end, 'c' contains unboxed representation (just '42'), as 'f'
    val c = id(f)
}