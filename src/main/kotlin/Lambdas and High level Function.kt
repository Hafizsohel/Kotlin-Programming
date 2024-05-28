fun main(args: Array<String>) {

    val program = Program()
    program.addTwoNumbers(2, 7) //simple way to better understand

    program.addTwoNumbers(2, 7, object : MyInterface {
        override fun execute(sum: Int) {
            println(sum)
        }
    })
    val test: String = "Hello"
    val myLamda: (Int) -> Unit = { s: Int -> println(s) } //Lamda Expression [Function]
    program.addTwoNumbers(2, 7, myLamda)
}

class Program {
    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) { //High level function with Lamda as Parameter
        val sum = a + b
        action(sum) //println(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) { //using interface / object Oriented way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) { //simple way to better understand
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}