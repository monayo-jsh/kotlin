package basic

class Collections

fun main() {
    CollectionsList()
    CollectionsSet()
    CollectionsMap()
}

fun CollectionsList() {
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    shapes.add("append")
    println(shapes)

    val shapesLocked: List<String> = shapes

    println(shapesLocked)

    shapes.add("test")
    println(shapesLocked)

    println(shapesLocked[0])
    println(shapesLocked.first())
    println(shapesLocked.last())
    println(shapesLocked.count())
    //to check that an item is in a list
    println("circle" in shapesLocked)

    shapes.remove("test")
    println(shapesLocked)
}

fun CollectionsSet() {
    // Read only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruit)

    println(fruit.count())
    println("banana" in fruit)

    fruit.add("dragonFruit")
    println(fruit)

    fruit.remove("dragonFruit")
    println(fruit)
}

fun CollectionsMap() {
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    println(juiceMenu["apple"])
    println(juiceMenu.count())

    juiceMenu.put("coconut", 150)
    //juiceMenu["coconut"] = 150
    println(juiceMenu)

    juiceMenu.remove("coconut")
    println(juiceMenu)

    println(juiceMenu.containsKey("apple"))

    println(juiceMenu.keys)
    println(juiceMenu.values)

    println("orange" in juiceMenu.keys)
    println(200 in juiceMenu.values)
}