import kotlin.ArithmeticException
fun main(args: Array<String>) {
try{
    var num = 10/0
}

catch (e : ArithmeticException){
    println("Divide by zero not allowed")
}
}