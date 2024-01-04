package Delegation

class DelegationPattern

// interface
interface SoundBehavior {
    fun makeSound()
}

// interface implement
class ScreamBehavior(val n: String) : SoundBehavior {
    override fun makeSound() = println("${n.uppercase()} !!!")
}

// interface implement
class RockAndRollBehavior(val n: String) : SoundBehavior {
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

// call interface implement
class TomAraya(n: String) : SoundBehavior by ScreamBehavior(n)

// call interface implement
class ElvisPresley(n: String) : SoundBehavior by RockAndRollBehavior(n)

fun main() {

    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()

    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()

}