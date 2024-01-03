package ControlFlow

class ControlFor

fun main() {
    practiceFor()
    practiceWhileAndDoWhile()
}

fun practiceFor() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}

fun practiceWhileAndDoWhile() {
    fun eatACake() = println("Eat a Cake")
    fun bakeACake() = println("Bake a Cake")

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}