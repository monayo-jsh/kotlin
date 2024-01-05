package VisibilityModifier

class _VISIBILITY_MODIFIER

private fun foo() {  } // visible inside example.kt

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in example.kt

internal val baz = 6    // visible inside the same module

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4 // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b: Int = 5 // 'b' is protected
    override val c: Int = 7 // 'c' is internal

    val e = Nested().e
}

class Unrelated(o : Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    val c = o.c
    val d = o.d

    // Outer.Nested is not visible, and Nested::e is not visible either
}