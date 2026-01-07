fun main() {
    val list: List<Int> = listOf(1,2,3)
    println(list)
    val stringList = listOf("Ian", "John", "Jane")
    println(stringList)
    //acessing elements
    println(list[0])
    //size
    println(list.size)
    //contains
    println(list.contains(2))

    //using the construct listOf does not allow us to add more elements, we use the construct below instead
    //create mutable list
    val mutableList = mutableListOf("Mongs","dante", "Collo")
    println(mutableList)
    //add
    mutableList.add("Ian")
    println(mutableList)

    //destructuring
    val (one, two, three) = mutableList
    println("$one $two $three")
    //the above concept helps us prevent doing this
    /*
    println(mutableList[0])
    print(mutableList[1])
     */
}