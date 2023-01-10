fun main() {
    // put your code here
    var count = 0
    do {
        var input = readln().toInt()
        count++
    } while (input != 0)
    println(count - 1)
}