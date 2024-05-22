@file:JvmName("MyCustomKotlinFileName")

package myJava
import myJava.MyJava


fun main(args:Array<String>){

    var area= MyJava.getArea(2,3)
    println("Area is $area")

    findVolume(height = 30, length = 2, breath = 3)


} fun add(a:Int, b:Int):Int{
    return a+b
}
@JvmOverloads
fun findVolume(length:Int, breath:Int, height:Int=10){

    println("Length is "+length)
    println("Breadth is "+breath)
    println("Height is "+height)
}