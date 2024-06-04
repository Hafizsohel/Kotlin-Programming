fun main(args: Array<String>) {

    //Map : Key-value pair
    //var myMap = mapOf<Int, String>(2 to "Hafiz", 24 to "Abrar", 8 to "Eamon") //Immutable, Fixed Size, Read Only
    /*var myMap = HashMap<Int, String>()  //Mutable, Read and Write both
    myMap.put(4,"Hafiz")

    myMap.replace(4,"Abrar")*/


    //"Set" contains unique elements
    //"HashSet" also contains unique elements but Sequence is not guaranteed in output
    //var mySet = setOf<Int>(2,35,0,4,55,8,8,8)   //Immutable. Read Only
    var mySet = mutableSetOf<Int>(2,35,0,4,55,8,8,8)   //mutable. Read and write
    mySet.remove(35)


for (element in mySet){     //Using Individual Element (Objects)
    println(element)
}

    /*for (key in myMap.keys) {    //Using Individual Element (Objects)
        println("Element at Key: $key = ${myMap[key]}")         //myMap.get(kay)
    }*/
}