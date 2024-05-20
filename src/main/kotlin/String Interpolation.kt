fun main(args: Array<String>) {
    val name = "Sam"
    var str = "Hello " + name
    println("The statement is $str. The number of character is statement is ${str.length}")

    val a = 10
    val b = 5
    println("The sum of $a and $b is ${a + b}")


    var rect =Rectangle()
    rect.length = 5
    rect.breadth = 3
    println("The length of rectangle is ${rect.length} and breadth is ${rect.breadth}. The Area is ${rect.length * rect.breadth} ")

}

class Rectangle {
    var length: Int = 0
    var breadth: Int = 0
}

