fun main(args:Array<String>){
    val program = ProgramDemo()
    program.reserveAndDisplay("Hello",{it.reversed()})
}

class ProgramDemo{
    fun reserveAndDisplay(str:String, myFunc:(String)->String){  //High Level Function with Lamda as Parameter

        var result = myFunc(str)    //str.reversed() == "hello".reversed = "olleh"
        println(result)
    }

}