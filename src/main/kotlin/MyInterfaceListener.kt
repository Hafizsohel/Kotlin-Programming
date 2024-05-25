fun main(args: Array<String>) {
    var myBtn=MyButton()
    myBtn.onTouch()
    myBtn.onClick()


}

interface MyInterfaceListener { //
   // abstract var name: String  //properties in interface are abstract by default

    fun onTouch()  // Methods in interface are abstract by default
    fun onClick() { // Normal methods are public and open by default NOT FINAL
    println("onClick Interface code: Button Clicked")
    }
}

/*class MyButton : MyInterfaceListener, MySecondInterface {
    override var name: String = "Hafiz"
    override fun onTouch() {
      println("This is onTouch function")
    }

    override fun onClick() {
        super.onClick()
        println("This is onClick function")
    }
}*/

interface MySecondInterface{ //
    fun onTouch()  // Normal method
    {
        println("MySecondInterface: onTouch")
    }
    fun onClick() { // Normal methods are public and open by default NOT FINAL
        println("onClick Interface code: Button Clicked")
    }
}
class MyButton: MyInterfaceListener, MySecondInterface{
    override fun onTouch() {
    super.onTouch()
    }
    override fun onClick() {
    super<MyInterfaceListener>.onClick()
    }
}