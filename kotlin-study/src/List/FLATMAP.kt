package List

//단일 목록으로 작성
class FLATMAP

fun main() {
    val fruitsBag = listOf("apple","orange","banana","grapes")
    val clothesBag = listOf("shirts","pants","jeans")

    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println(mapBag)
    println()
    println(flatMapBag)
}