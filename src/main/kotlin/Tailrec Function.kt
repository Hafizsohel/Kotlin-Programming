import java.math.BigInteger

fun main(args:Array<String>){

    println(getFibonacciNumber(10000, BigInteger("1"),BigInteger("0")))
}
// 0 1 1 2 3 5 8 13 21
tailrec fun getFibonacciNumber(n:Int, a: BigInteger, b:BigInteger):BigInteger{
    if (n==0)
        return b
    else
        return getFibonacciNumber(n-1,a+b,a)
}