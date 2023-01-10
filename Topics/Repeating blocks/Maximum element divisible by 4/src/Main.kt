fun main() {
    // put your code here
    val numberOfElements = readln().toInt()
    val numbers = mutableListOf<Int>(0)
    var index = 0
    repeat(numberOfElements) {
        val element: Int = readln().toInt()
        if (element % 4 == 0 && element > numbers[index]) {
            numbers.add(element)
            index++
        }

    }
    println(numbers.last())
}