fun main(args: Array<String>) {
    var dog = Dog("Black","Pug")

}
/*open class Animal(var color:String){ //super class
    init {
        println("From Animal Init: $color")
    }
}

class Dog(color: String, var breed: String): Animal(color) { //Derived class
    init {
        println("From Dog Init: $color and $breed")
    }

}*/

open class Animal { //super class

    var color: String = ""
    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }
}
class Dog : Animal {
    var breed: String = ""
    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
        println("From Dog: $color and $breed")
    }
}


