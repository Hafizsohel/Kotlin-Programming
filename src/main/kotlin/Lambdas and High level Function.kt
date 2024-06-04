fun main(args: Array<String>) {

    val program = Program()
    var result=0
    program.addTwoNumbers(2, 7) //simple way to better understand

    program.addTwoNumbers(2, 7, object : MyInterface {
        override fun execute(sum: Int) {
          //  println(sum)
        }
    })
    val test: String = "Hello"
   // val myLamda: (Int, Int) -> Int = { x: Int, y:Int -> x+y } //Lamda Expression [Function]
    //program.addTwoNumbers(2, 7 , { x, y -> x+y })

    program.addTwoNumbers(2, 8 ) { x, y -> result= x+y }
    println(result)
}

class Program {
    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) { //High level function with Lamda as Parameter
        val sum = a + b
        action(a,b)     // x+y = a+b = 2+8 = 10
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) { //using interface / object Oriented way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) { //simple way to better understand
        val sum = a + b
       // println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}