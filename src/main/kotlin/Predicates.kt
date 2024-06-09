fun main(args:Array<String>){
    val myNum= listOf(2,3,4,6,23,90)

    val myPredicate={num:Int->num>10}

    val check1= myNum.all(myPredicate) //({ it > 10 }) //Are all elements greater than 10?
    println(check1)

    val check2 = myNum.any(myPredicate)  //({ it>10 })  //Does any of these elements satisfy then Predicate?
    println(check2)

    val totalCount = myNum.count(myPredicate)   //{ it>10 } //Number of elements that satisfy the Predicate
    println(totalCount)

    val num = myNum.find(myPredicate)     // { it>10 }   //Return the first number that matches the Predicate
    println(num)

    val check4 = myNum.last(myPredicate)
    println(check4)

    val check5 = myNum.findLast(myPredicate)
    println(check5)
}