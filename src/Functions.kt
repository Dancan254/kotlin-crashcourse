import kotlin.math.floor

fun main() {
    //call/invoke the method
    greet("ian", 119)
    //named arguments
    greet(age = 119, name = "ian")
    //without providing params, defaults
    add()
    //function
    printMessage(bar = { println("Hello from the lambda") })
    //default
    printMessage()

    val result = multiply(2, 3)
    println(result)

    //deconstruct the two values
    val (a, b) = sum(2, 3)
    println("$a + $b = ${a+b}")
}

fun greet(name: String, age: Int){
    println("hello $name")
    if(age < 0) return
    if(age > 18) println("$name you are old enough to drive")
    else println("$name you are too young to drive")
}

//default values
fun add(a: Int = 1, b: Int = 1){
    println(a+b)
}

//passing a function as a parameter
fun printMessage(bar: () -> Unit ={}){
    println("Print message function")
    bar()
}

//returning  values
fun multiply(a: Int, b: Int): Int{
    return a*b
}
//single type funtion
fun double(a: Int) = a*2

//return two values
fun sum(a: Int, b: Int): Pair<Int, Int>{
    return Pair(a, b)
}