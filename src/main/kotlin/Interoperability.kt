@file:JvmName("MyCustomKotlinFileName")

package myJava
import myJava.MyJava


fun main(args:Array<String>){

    var area= MyJava.getArea(2,3)
    println("Area is $area")

    var result = findVolume(2,3,30)
    println(result)

} fun add(a:Int, b:Int):Int{
    return a+b
}
@JvmOverloads
fun findVolume(length:Int, breath:Int, height:Int=10):Int{
    return length * breath * height
}