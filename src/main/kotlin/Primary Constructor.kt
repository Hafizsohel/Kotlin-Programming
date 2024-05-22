fun main(args:Array<String>){
    var student =Student("Hafiz")
}
class Student(var name:String){
    init {
        println("Student has got a name as $name")
    }
}