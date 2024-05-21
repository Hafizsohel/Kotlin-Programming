fun main(args: Array<String>) {
    //Loop Break
    /* for (i in 1..10){
         println(i)
         if (i==5)
             break
     }*/
//Loop Break inner and outer
    /* myLoop@ for (i in 1..3) {
         for (j in 1..3) {
             println("$i $j")
             if (i == 2 && j == 2)
                 break@myLoop
         }
     }*/

    //Loop continue statement

   /* for (i in 1..10) {
        if (i%2 == 0) {
            continue
        }
        println(i)
    }*/

    //Loop continue statement
    outer@for (i in 1..3){
        for (j in 1..3){
            if (i==2 && j==2)
                continue@outer
            println("$i $j")
        }
    }

}