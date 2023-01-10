fun main() {
    // put your code here
    val first = readln().first()
    val second = readln().first()
    val third = readln().first()

    println((first < second) && (second == first +1) && (second < third) && (third == second + 1))
}