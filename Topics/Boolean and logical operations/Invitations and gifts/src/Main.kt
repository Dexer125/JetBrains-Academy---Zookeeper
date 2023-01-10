fun main() {
    val invitation = readLine().toBoolean()
    val gift = readLine().toBoolean()
    val allow = invitation && gift

    println(allow)
}