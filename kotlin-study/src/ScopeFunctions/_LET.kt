package ScopeFunctions

class _LET

fun customPrint(str: String) {
    print(str)
}

fun printNonNull(str: String?) {
    println("Printing \"$str\"")

    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let {firstString ->
        strTwo?.let {secondString ->
            customPrint("$firstString : $secondString")
            println()
        }
    }
}

fun main() {

    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First", "Second")
}