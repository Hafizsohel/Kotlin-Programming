import kotlin.math.max

fun main(args: Array<String>) {
  /*  var sum = add(2, 4)
    println("Sum is $sum")
}

fun add(a: Int, b: Int): Int {
    return a + b*/

    var largeValue = max(4,6)
    println("The greater number is $largeValue")
}
fun max(a:Int, b:Int): Int = if (a>b) a else b