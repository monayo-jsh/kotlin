package basic

class ControlFlow

fun main() {
    ControlFlowIf()
    ControlFlowWhen()
    ControlFlowFor()
    ControlFlowWhile()

    ControlFlowPractice1()
    ControlFlowPractice2()
    ControlFlowPractice3()
    ControlFlowPractice4()
}

fun ControlFlowIf() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val a = 1
    val b = 2
    println(if (a > b) a else b)
}

fun ControlFlowWhen() {
    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks wheter obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }

    val result = when (obj) {
        // Checks whether obj equals to "1"
        "1" -> "One"
        // Checks wheter obj equals to "Hello"
        "Hello" -> "Greeting"
        // Default statement
        else -> "Unknown"
    }

    println(result)

    val temp = 18

    val description = when {
        temp < 0 -> "very cold"
        temp < 10 -> "a bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }

    println(description)
}

fun ControlFlowFor() {
    for (number in 1..5) {
        println(number)
    }

    // Collections can also be iterated over by loops:
    val cakes = listOf("carrot", "cheese", "chocolate")
    for(cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}

fun ControlFlowWhile() {

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    var cakesBaked = 0
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

fun ControlFlowPractice1() {
    val button = "A"

    println(
        when(button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}

fun ControlFlowPractice2() {
    var pizzaSlices = 0

    while(pizzaSlices < 8) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    pizzaSlices = 0
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    } while (pizzaSlices < 8)

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun ControlFlowPractice3() {
    for (number in 1..100) {
        println(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> number.toString()
            }
        )
    }
}

fun ControlFlowPractice4() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for(word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}