package Classes

class AbstractClasses

private abstract class Polygon {
    abstract fun draw()
}

private class Rectangle : Polygon() {
    override fun draw() {
        println("draw Rectangle !")
    }
}

private open class Polygon2 {
    open fun draw() {
        println("default polygon drawing method.")
    }
}

private abstract class WildShape : Polygon2() {
    abstract fun draw2()
}

private class WildShapeImpl : WildShape() {
    override fun draw2() {
        println("WildShape @")
    }
}

fun main() {
    val rectangle: Polygon = Rectangle()
    rectangle.draw()

    val wildShape : WildShape = WildShapeImpl()
    wildShape.draw()
    wildShape.draw2()
}