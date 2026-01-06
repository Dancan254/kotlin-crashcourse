const val PI = 3.141 //similar to static final in java - global static final
fun main() {
    // Kotlin does not have primitive data types
    var number: Int = 10
    var l: Long = 100L
    var d: Double = 10.5
    var f: Float = 10.5F
    var b: Boolean = true
    var s: String = "Hello"
    var c: Char = 'A'

    // any type
    var any: Any = "Heelo" // this could hold any data type
    //you should not use this though

    //we could also get rid of the type and depend on type inference
    var name = "Dancan"
    println("Initial name: $name")
    name = "Mongare"
    println("Updated name: $name")
    //remember that var is stores mutable variable, val is stores immutable variable
    val tag = "tag" // always prefer immutability, same as final in java

    //Null Safety
    var nullString: String? = "Ian"
    nullString = null

    //convert
    val num = "10"
    println(num.toInt())
    //booleam
    val isTrue: Boolean = true
    println(isTrue)
}