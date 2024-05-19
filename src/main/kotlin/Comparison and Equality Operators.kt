fun main(args:Array<String>){
    val a= -12
    val b=12
    val max = if (a>b){
        println("a is larger then b.")
        a
    } else{
        println("b is larger then a.")
        b
    }
    println("Max: $max")
}