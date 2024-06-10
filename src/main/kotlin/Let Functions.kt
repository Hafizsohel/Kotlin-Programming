fun main(args:Array<String>){
    val name:String? = "Hello"

   val stringLength = name?.let {
       println(it.reversed())
       println(it.capitalize())
       it.length
   }
    println(stringLength)
}