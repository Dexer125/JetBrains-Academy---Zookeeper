fun main() {
    // put your code here
    var input = readln().toLong()
    var result1 = input % 2
    if(result1 > 0){
        println((input % 2) +input)
    }else{
        println((input % 2) + input +2)
    }

}