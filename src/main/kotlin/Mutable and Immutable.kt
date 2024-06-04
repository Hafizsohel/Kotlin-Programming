fun main(args: Array<String>) {
    var list = mutableListOf<String>("Abrar", "Emon", "Sumon", "Rana") //Immutable, Fixed size, Read only
    list.add("Hafiz")
    list.remove("Rana")


    for (element in list) {  //Using individual element (Object)
        println(element)
    }
    println()
    for (index in 0..list.size - 1) {
        println(list[index])
    }
}