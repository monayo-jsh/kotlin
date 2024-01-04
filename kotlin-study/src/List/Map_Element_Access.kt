package List

class Map_Element_Access

fun main() {

    val map = mapOf("key" to 42)

    val value1 = map["key"]
    println(value1)

    val value2 = map["key2"]
    println(value2)

    val value3: Int = map.getValue("key")
    println(value3)

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")
    println(value4)

    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }

}