package basic

class NullSafety

fun main() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    //neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK
    nullable = null

    // By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"

    // Throws a compiler error
    //inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18

    // Kotlin: Type mismatch: inferred type is Nothing? but String was expected
    // Throws a compiler error
    //println(strLength(nullable))

    fun describeString(maybeString: String?): String {
        if (maybeString.isNullOrEmpty()) {
            return "Empty or null string"
        }

        return "String of length ${maybeString.length}"
    }

    var nullString: String? = null
    println(describeString(nullString))
    nullString = "string value"
    println(describeString(nullString))

    fun lengthString(maybeString: String?): Int? = maybeString?.length
    nullString = null
    println(lengthString(nullString))
    nullString = "string value"
    println(lengthString(nullString))

    nullString = null
    println(nullable?.length ?: 0)
    nullable = "string value"
    println(nullable?.length ?: 0)

    NullSafetyPractice()
}

fun NullSafetyPractice() {
    println("NullSafety Practice !")
    println((1..5).sumOf { id -> salaryById(id) })
}

data class Employee2(val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> Employee2("Mary", 20)
    2 -> null
    3 -> Employee2("John", 21)
    4 -> Employee2("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0
