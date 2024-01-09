package Classes.Delegation

import Delegation.Delegate
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class _Properties

private class Example {
    var p: String by Delegate()
}

private class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has ben assigned to '${property.name}' in $thisRef.")
    }
}

private class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "greeting !"

    val lazyValue: String by lazy {
        println("computed !")
        "Hello"
    }

    println(lazyValue)
    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"
}