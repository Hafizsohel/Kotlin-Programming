/*FILTER
* Returns a list containing only elements matching the given [predicate]
* */

/*MAP
* Returns a list containing the results of applying the given [transform] function
* to each element in the original collection
* */

fun main(args: Array<String>) {
    val myNumbers = listOf(2, 3, 4, 6, 90)
    val mySmallNums = myNumbers.filter { it < 10 }   // OR {v- > v < 10}

    /*for (num in mySmallNums){
        println(num)
    }*/

    val mySquareNums = myNumbers.map { num -> num * num } //OR {it*it}

    /*  for (num in mySquareNums){
          println(num)
      }*/

    val mySmallSquaredNums = myNumbers.filter { it < 10 }
        .map { it * it }
    for (num in mySmallSquaredNums) {
        println(num)
    }
    var people = listOf<Person2>(Person2(10, "Abrar"), Person2(23, "Emon"), Person2(70, "Rana"))
    var names = people.filter { it.name.startsWith("E")}
                                  .map { it.name }


    for (name in names) {
        println(name)
    }
}

class Person2(var age: Int, var name: String) {

}