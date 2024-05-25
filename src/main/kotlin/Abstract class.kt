fun main(args:Array<String>){

}
abstract class Person { //You can not create instance of abstract class
    abstract var name: String
    abstract fun eat() //abstract properties are "open" by default
    open fun getHeight() {} //A "open" function ready to be overridden
    fun goToSchool() {} //A normal Function: public and final by default
}
class Bangladeshi:Person(){
   override var name:String="dummy bangladeshi name"
    override fun eat() {

    }
}