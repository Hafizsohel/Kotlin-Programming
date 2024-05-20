fun main(args:Array<String>){
    var r1= 1..5
    //The range contain the number 1,2,3,4,5

    val r2= 5 downTo 1
    //The range contain the number 5,4,3,2,1

    val r3 = 5 downTo 1 step 2
    //The range contain the number 5,3,1

    var r4= "a".."z"
    //The range contain the value from "a","b","c".."z"

    var r5='a'..'z'
    //The range contain the value from 'a','b','c'..'z'

    var isPresent ='c' in r5

    var countDown = 10.downTo(1)
    //This range contains the number 10,9,8,7....1

    var moveUp =1.rangeTo(10)
    //This range contains the number 1,2,3....10
}