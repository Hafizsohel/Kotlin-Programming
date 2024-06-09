//val pi: Float = 3.14f       //Waste of memory

val pi:Float by lazy {
    3.14f
}

fun main(args:Array<String>){
    println("Some initial code....")

    val area1=pi * 4 * 4
    println("Some initial code....")
}