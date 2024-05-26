fun main(args:Array<String>){

    MyClass.count
    MyClass.typeOfCustomers()
   /* CustomersData.count =98
    CustomersData.typeOfCustomers()
    println(CustomersData.count)

    CustomersData.count=109
    println(CustomersData.count)
    CustomersData.myMethod("Hello")*/
}
/*open class MySuperClass{
    open fun myMethod(str: String){
        println("MySuperClass")
    }
}*/

class MyClass {
    companion object {

        var count: Int = -1   //Behaves like STATIC variable

        fun typeOfCustomers(): String {   //Behaves like STATIC methods
            return "Bangladeshi"
        }
    }
}


/*object CustomersData : MySuperClass(){
    var count:Int= -1   //Behaves like STATIC variable
    fun typeOfCustomers():String{   //Behaves like STATIC methods
        return "Bangladeshi"
    }*/
   /* override fun myMethod(str: String) {    //Currently, behaving like STATIC method
        super.myMethod(str)
        println("Object CustomerData : $str")
    }*/