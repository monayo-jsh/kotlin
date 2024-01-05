package Classes.Seald

import java.io.File
import javax.sql.DataSource

class _Seald_interface

private sealed interface Error

private sealed class IOError() : Error {
    private constructor(description: String) : this()
    // public constructor Error: public and internal are not allowed
}

private class FileReadError(val file: File): IOError()
private class DatabaseError(val source: DataSource): IOError()

private data object RuntimeError : Error

private fun log(e: Error) = when(e) {
    is FileReadError -> { println("Error while reading file ${e.file}") }
    is DatabaseError -> { println("Error while reading from database ${e.source}") }
    is RuntimeError -> { println("Runtime error") }
    // the `else` clause is not required because all the cases are covered
}

fun main() {
    log(FileReadError(File("local")))
}