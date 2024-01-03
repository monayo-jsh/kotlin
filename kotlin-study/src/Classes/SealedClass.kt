package Classes

//상속 사용을 제한
//선언된 동일한 패키지 내부에서만 서브 클래스 가능
class SealedClass

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) : String {
    val result = when (mammal) {
        //smart casting
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        //smart casting
        is Cat -> "Hello ${mammal.name}"
    }
    return result
}

fun main() {
    println(greetMammal(Human("JSH", "Developer")))
    println(greetMammal(Cat("Snowy")))
}