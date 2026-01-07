fun main() {
    val list = listOf(1,2,3,4,5)

    for(num in list){
        println(num)
    }

    val names = listOf("ian", "john", "jane")
    for(name in names){
        //convert first char to caps
       val newName =  name.replaceFirstChar { it.uppercase() }
        println(newName)
    }
    println(names.toString())

    //indices
    for(index in names.indices){
        println("$index - ${names[index]}")
    }
    //reversed indices
    for(index in names.indices.reversed()){
        println("$index - ${names[index]}")
    }
    //ranges
    //from 10-15
    for(i in 10..15){
        println(i)
    }
    //in reverse
    for(i in 15 downTo 10) println(i)

    ///steps -> increment by 2
    for(i in 1..10 step 2) println(i)

    //looping through strings
    val name = "Mongare"
    for(char in name){
        print("$char ")
    }
    println()
    //using for each
    names.forEach { println(it) }

    //While loop
    var i = 0
    while(i <= 3){
        println(i)
        i++
    }
    val brand = "your_javaguy"
    var index = brand.length - 1 //index is var as it changes
    while(index >= 0){
        println(brand[index])
        index--
    }

    //do while loop
    var count = 0
    do{
        println("Hello")
        count++
    }while (count <= 3)

    //break and continue
    val numbers = arrayOf(1, 3, 5, 6, 7)
    //skip 5
    for(num in numbers){
        if(num == 5) continue
        println(num)
    }

    //break when i meet 5
    for(num in numbers){
        if (num == 5) break
        println(num)
    }
}