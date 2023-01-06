import java.util.*

fun main() {
    //ЗАДАНИЕ 1
    println("TASK 1")
    println("Please enter a string: ")
    var str = Scanner (System.`in`)
    var userInput : String = str.nextLine()
    while (!userInput!!.equals("Exit", ignoreCase = true)) {
        println("Please enter something")
        userInput = str.nextLine()
    }
    println("\n")


    //ЗАДАНИЕ 2
    println("TASK 2")
    var str2 = Scanner(System.`in`)
    println("Please enter a number: ")
    val x = str2.nextInt()
    var sum = 0
    if(x<0)
    {
        for(i in x..0)
            sum += i
        println("The sum of all numbers from $x to 0 is $sum \n")
    }
    else
    {
        for(i in 0..x)
            sum += i
        println("The sum of all numbers from 0 to $x is $sum \n")
    }


    //ЗАДАНИЕ 3
    println("TASK 3")
    println("Please enter your score: ")
    var score = Scanner(System.`in`).nextInt()
    while(score < 0 || score > 100)
    {
        println("You entered an incorrect number! Please enter again: ")
        score = Scanner(System.`in`).nextInt()
    }
    if (score >= 70)
        println("Congrats! You’ve passed the test! \n")
    else
        println("Sorry, you’ve failed the test. \n")


    //ЗАДАНИЕ 4
    var arr = arrayOf("National Geographic", "BBC", "News", "Times", "Nickelodeon")
    println("TASK 4")
    println("Please enter a channel number: ")
    var channel = Scanner(System.`in`).nextInt()
    when(channel) {
        0 -> "break"
        1 -> println(arr[0])
        2 -> println(arr[1])
        3 -> println(arr[2])
        4 -> println(arr[3])
        5 -> println(arr[4])
        else -> println("Please enter a number from 1 to 5")
    }
}