fun main() {
    val name  = "your_javaguy"
    //string methods
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])

    println("".isEmpty())
    println(" ".isBlank())

    //String templates
    val age = 10;
    val message = "My name is $name and I am $age years old"

    //multiline strings
    val multiline = """
        Hello
            %s
            how
        are you?
    """.trimIndent()

    println(multiline.format(name))

    //comparing strings
    val name1 = "Dancan"
    val name2 = "Dancan"
    println("== ${name1 == name2}") // this is true as it compares the content unlike in Java
    //to compare the memory address use ===
    println("=== ${name1 === name2}") // this is false
    println("equals ${name1.equals(name2)}") // this is true

    //the same concept of string pool applies here
    
}