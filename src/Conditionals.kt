fun main() {
    val n1 = 10
    val n2 = 20

    //unlike java, this is an expression, it can be re assigned to a variable
    val result = if (n1 > n2) n1 else n2
    if (n1 > n2) {
        println("n1 is greater than n2")
    } else{
      println("n2 is greater than n1")
    }
}