fun main() {
    // put your code here
    val n = readln().toInt()
    var k = 0
    var index = 0
    val mutableList = mutableListOf(1)
    while (k < n) {
        repeat(mutableList[index] - 1) {
            mutableList.add(mutableList[index])
        }

        mutableList.add(mutableList[index] + 1)
        index = mutableList.lastIndex
        k++
    }
    mutableList.removeAt(mutableList.lastIndex)
    index = 0
    repeat(n) {
        print(mutableList[index].toString() + " ")
        index++
    }

}