import java.awt.Color

interface ICardCashBack{
    fun getCashbackValue():Float
}

enum class CreditCardType(val color: String, val maxLimit:Int=100000):ICardCashBack{

    SILVER("gray",30000){
        override fun getCashbackValue(): Float = 0.02f },   //ordinal = 0   name="SILVER"
    GOLD("gold",50000){
        override fun getCashbackValue(): Float = 0.04f },   //ordinal = 1   name="GOLD"
    PLATINUM("black",100000){
        override fun getCashbackValue(): Float = 0.06f },   //ordinal = 2   name="PLATINUM"
}


fun main(){
   /* //Enum constants are objects of enum class type.
    val hafizCardType: CreditCardType = CreditCardType.GOLD

    //Each enum object has two properties: ordinal and name
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD)    //or CreditCardType.GOLD.name

    //Each enum object has two methods: value() and valueOf()
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) }

    //Using in 'when' statement
    when(hafizCardType){
        CreditCardType.SILVER -> println("Hafiz has silver card")
        CreditCardType.GOLD -> println("Hafiz has gold card")
        CreditCardType.PLATINUM -> println("Hafiz has platinum card")
    }*/

    println(CreditCardType.SILVER.color) //gray
    println(CreditCardType.SILVER.getCashbackValue()) //0.02


}