package Classes

class InheritanceClasses

//계승
private open class Base(p: Int)

private class Derived(p: Int) : Base(p)

//메서드 재정의
private open class Shape {
    open val vertexCount: Int = 0

    open fun draw() {}
    fun fill() {}
}

private class Circle : Shape() {
    override val vertexCount = 4

    override fun draw() {
        // override
    }
}

private open class Square : Shape() {
    final override fun draw() {
        // prevent override
    }
}

private class SquareImpl : Square() {
    // can't override
//    override fun draw() {
//        super.draw()
//    }
}

private interface Shape2 {
    val vertextCount: Int
}

private class Rectangle2(override val vertextCount: Int = 4) : Shape2

private class Polygon3 : Shape2 {
    override var vertextCount: Int = 0
}

private open class Base2(val name: String) {

    init {
        println("Initializing a base class")
    }

    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it") }

}

private class Derived2(
    name: String,
    val lastName: String
) : Base2(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it ") }) {

    init {
        println("Initializing a derived class")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }

}

private open class Rectangle3 {
    val borderColor: String get() = "black"

    open fun draw() {
        println("Drawing a rectangle")
    }
}

private class FilledRectangle : Rectangle3() {
    override fun draw() {
        //super.draw()
        //println("Filling the rectangle")
        val filter = Filter()
        filter.drawAndFill()
    }

    val fillColor: String get() = super.borderColor

    inner class Filter {
        fun fill() {
            println("inner class Filling")
        }
        fun drawAndFill() {
            super@FilledRectangle.draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}")
        }
    }
}

private open class obj1 {
    open fun draw() {
        println("obj1 draw")
    }
}

private interface if1 {
    fun draw() {
        println("if1 draw")
    }
}

private class Impl1 : obj1(), if1 {
    override fun draw() {
        super<obj1>.draw()
        super<if1>.draw()
    }
}


fun main() {
    val derived2 = Derived2("base2", "derived2")

    val filledRectangle = FilledRectangle()
    filledRectangle.draw()

    val impl1 = Impl1()
    impl1.draw()
}