fun main(args:Array<String>){
    var student =Student1("Hafiz",10)
    println(student.id)
}
class Student1(var name:String){
    var id:Int=-1
    init {
        println("Student has got a name as $name and id is $id")
    }
    constructor(n: String, id:Int):this(n){
        //The body of secondary constructor is called after the init block
    this.id=id
    }
}