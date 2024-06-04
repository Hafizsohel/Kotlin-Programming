fun main(args: Array<String>) {
    var person = Person1()


    with(person){
        name = "Hafiz"
        age = 24
    }

    person.apply {
      name = "Hafiz"
      age = 24
    }.startRun()

    println(person.name)
    println(person.age)
}

class Person1() {
    var name = ""
    var age: Int = -1

    fun startRun() {
        println("Now I am ready to run")
    }
}