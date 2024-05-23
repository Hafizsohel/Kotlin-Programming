fun main(args: Array<String>) {

   /* var dog = Dog()
    println(dog.color)
    //dog.eat()

    *//*var cat = Cat()
    cat.eat()

    var animal = Animal()
    animal.eat()*//*



}
open class Animal{
    open var color:String = "Red"

    open fun eat(){
        println("Animal Eating")
    }
}
class Dog:Animal() {
    var breed:String = ""

    override var color:String = "Black"
    fun bark(){
        println("Bark")
    }
    override fun eat(){
        super<Animal>.eat()
        println("Dog is eating")
    }
}

class Cat:Animal(){
    var age:Int = -1
    fun meow(){
        println("Meow")
    }
    override fun eat(){
        println("Cat is eating")
    }*/
}