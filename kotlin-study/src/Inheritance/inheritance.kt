package Inheritance

class inheritance

fun main() {
    val dog: Dog = Dog()
    dog.sayHello()

    val yorkshire: Dog = Yorkshire()
    yorkshire.sayHello()

    val tiger: Tiger = Tiger("tiger")
    tiger.sayHello()

    val siberianTiger: Tiger = SiberianTiger()
    siberianTiger.sayHello()

    val lion: Lion = Lion("Lion", "Asia")
    lion.sayHello()

    val asiatic: Lion = Asiatic("Rufo")
    asiatic.sayHello()
}