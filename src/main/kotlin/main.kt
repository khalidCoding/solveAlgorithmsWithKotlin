import java.lang.Exception


var n: Int = 0
var s: String = ""
var correctIntegerInput: Boolean = false
var correctStringInput: Boolean = false
var containNumber : Boolean = false

fun main() {


    while (!correctIntegerInput) {
        try {
            println("Enter a number between 0 and 10")
            n = readLine()!!.toInt()
            correctIntegerInput = n in 0..10

        } catch (e: Exception) {
            correctIntegerInput = false
        }

    }

    n *= 2


    while (!correctStringInput) {
        containNumber = false
        println("Enter a string between 1 and 15 character")
        s = readLine()!!.toString()
        if (s.length in 1..15) {
            for (i in s.indices) {
                if (s[i].isDigit()) {
                    containNumber = true
                }
            }
            correctStringInput = !containNumber
        }else{
            correctStringInput = false
        }


    }

    println(n)
    println(s)


}

