fun main(){

    val gender = "F"

    when (gender){
        "F" -> println("Female")
        "M" -> println("Male")
        else -> println("Other")
    }

    //you can also return a value
    val grade = "A"
    val result = when (grade){
        "A" -> "Excellent"
        "B" -> "Good"
        else -> "Fail"
    }

    //whenever you have several if-else if statements you could easily use a when expression
    val day = 2
    if(day == 1) println("Monday")
    else if(day == 2) println("Tuesday")
    else if(day == 3) println("Wednesday")
    else println("Other day")

    //when using when
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
    }

    //working with ranges
    val age = 18
    when(age){
        in 13..19 -> println("Teens")
        in 20..29 -> println("Twenties")
        else -> println("Other age")
    }
}