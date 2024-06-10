class aPerson{
    var name:String="Hafizur Rahman"
    var age:Int = 25
}

fun main(args:Array<String>){

    /*
    * Scope Function:'apply'
    * Property 1: Refer to context object by using 'this'
    * Property 2: The return value is the 'context object'*/

    val person=aPerson().apply {
        name = "Hasibur Rahman"
        age = 24
    }
    /*println(person.name)
    println(person.age)*/

    //OR

    val ageAfterFiveYear:Int = with(person){
        println(name)
        println(age)
        age+5
    }
    //Perform some other operations on 'person' Object
    val duplicatePerson = person.also {
        it.name = "Rakibul Islam Rashik"
        println("New Name:${it.name}") // prints New name: Rakibul Islam Rashik
    }


    println("Age after five year: $ageAfterFiveYear")


    val numberList:MutableList<Int> = mutableListOf(1,2,3)

    val duplicateNumbers = numberList.also {
        println("The list of elements are: $it")
        it.add(4)
        println("The list of elements after adding an element: $it")
        it.remove(2)
        println("The list of elements after removing an element: $it")

    }

    //some other code... may be a function call or a program to swap two numbers
    //Operations on the 'numberList'
    /*println("The list of elements are: $numberList")

    numberList.add(4)
    println("The list of elements after adding an element: $numberList")

    numberList.remove(2)
    println("The list of elements after removing an element: $numberList")
*/
    println("Original numbers: $numberList")
    println("Duplicate numbers: $duplicateNumbers")
}