fun main(args:Array<String>){

    //Arrays
    //Elements: 32 0 0 54 0 0
    //Index:     0 1 2 3 4 5

    var myArray = Array<Int>(6){0}  //Mutable Fixed size
    myArray[0]= 32
    myArray[3]=54

    println(myArray[3])

    for (element in myArray){
        println(element)
    }
    for (index in 0..myArray.size-1){
        println("Index Array: ${myArray[index]}")
    }
}