fun main() {
    //size cannot be expanded
    val names = arrayOf("ian", "Dancan")
    //you could also constrain your array to holding only a certain data type
    val cars = arrayOf<String>("BMW", "Cayenne")
    //accessing by index
    println(names[0]) //accessing an index not presents yield the classic array out of bound
    //size
    println(names.size)
    //whether present
    if("Mongs" in names){
        println("Found")
    }
    else{
        println("Not found")
    }
    //printing the array
    print(names.toString())

    //create an array of nulls
    val nulls = arrayOfNulls<String>(5)
    println(nulls.contentToString())
    nulls.fill("Ian")
    println(nulls.contentToString())
    //empty array
    val empty = emptyArray<Int>()
    println(empty.contentToString())
}