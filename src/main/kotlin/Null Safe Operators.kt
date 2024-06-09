fun main(args:Array<String>){
    //WAP to find out length of name
    val name:String? = "null"

    //1.Safe Cell ( ?. )
    //Returns the length if 'name' is not null else returns NULL
    //Use it if you don't mind getting null value
    println("The length of name is ${name?.length}")

    //2. Safe Cell with ( ?.let)
    //It executes the block ONLY IF is NOT NULL
    name?.let {
        println("The length of name is ${name.length}")
    }


    //3. Elvis Cell with let ( ?:)
    //When we have nullable reference 'name', we can say "is name is not null", use it,
    //otherwise use some non-null value"
    val len=if(name!=null)
                    name.length
                    else
                        -1
                //  OR
    val length = name?.length ?: -1
    println("The length of name is ${length}")

    //4. Non-null assertion operator ( !! )
    //Use it when you are sure the value is NOT Null
    //Throws NullPointerException if the value is found to be NULL.
    println("The length of name is ${name!!.length}")
}