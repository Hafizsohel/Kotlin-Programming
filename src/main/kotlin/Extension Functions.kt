import myJava.add

fun main(args: Array<String>){
/*    var student = Student()
    println("Pass status: "+student.hasPassed(57))
    println("Scholarship Status: "+student.isScholer(57))
}
fun Student.isScholer(marks: Int):Boolean{
    return marks>95
}

class Student{
    fun hasPassed(marks:Int):Boolean{
        return marks >40
    }*/

 /*   val str1:String = "Hello "
    val str2:String = "World"
    val str3:String = "Hey "

    println(str3.add(str1,str2))*/

    val x:Int=5
    val y:Int=10

   // val greaterValue=x.greaterValue(y) //Extension func
    val greaterValue = x greaterValue y  //Infix func (x.greaterValue(y)) both are same
    println(greaterValue)
}
/*
fun String.add(s1:String, s2:String):String{ //Extension function
    return this +s1 +s2
}*/

infix fun Int.greaterValue(other:Int):Int{ //Infix Function and also Extension function
    if (this>other)
        return this
    else
        return other
}
