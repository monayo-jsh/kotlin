package Classes

class EnumClass

fun main() {
    practiceEnumState()
    practiceEnumColor()
}

enum class State {
    IDLE, RUNNING, FINISHED
}

fun practiceEnumState() {
    val state = State.RUNNING

    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }

    println(message)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}
fun practiceEnumColor() {
    val red = Color.RED

    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}