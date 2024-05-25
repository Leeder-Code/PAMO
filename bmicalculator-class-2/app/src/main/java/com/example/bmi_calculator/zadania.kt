package com.example.bmi_calculator

import kotlin.math.PI

/**
 * Exercise 1
 * You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
 */

fun main1() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    // Calculate the total number of numbers
    val totalNumbers = greenNumbers.size + redNumbers.size

    // Print the total number of numbers
    println("Total number of numbers: $totalNumbers")
}

/**
 * 2 Exercise
 * You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol
 * is supported or not (isSupported must be a Boolean value).
 */

fun main2() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

/**
 * 3 Exercise
 * Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.
 * fun main() {
 * val number2word = // Write your code here
 * val n = 2
 * println("$n is spelt as '${<Write your code here >}'")
 * }
 *
 */

fun main3() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}

/**
 * 4 Exercise
 * You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
 * Use a while loop.
 * Use a do-while loop.
 * fun main() {
 * var pizzaSlices = 0
 * // Start refactoring here
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * println("There's only $pizzaSlices slice/s of pizza :(")
 * pizzaSlices++
 * // End refactoring here
 * println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
 * }
 */
fun main4_while() {
    var pizzaSlices = 0

    while (pizzaSlices < 8) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun main4_do_while() {
    var pizzaSlices = 0

    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    } while (pizzaSlices < 8)

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

/**
 * 5 Exercise
 * You have a list of words. Use for and if to print only the words that start with the letter l.
 * Hint
 * Use the .startsWith() function for String type.
 * fun main() {
 * val words = listOf("dinosaur", "limousine", "magazine", "language")
 * // Write your code here
 * }
 */

fun main5() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}

/**
 * 6 Exercise
 * You have a function that translates a time interval given in hours, minutes, and seconds into seconds. In most cases, you need to pass only one or two function
 * parameters while the rest are equal to 0. Improve the function and the code that calls it by using default parameter values and named arguments so that the code is
 * easier to read.
 * fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) =
 * ((hours * 60) + minutes) * 60 + seconds
 * fun main() {
 * println(intervalInSeconds(1, 20, 15))
 * println(intervalInSeconds(0, 1, 25))
 * println(intervalInSeconds(2, 0, 0))
 * println(intervalInSeconds(0, 10, 0))
 * println(intervalInSeconds(1, 0, 1))
 * }
 */

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0): Int {
    return ((hours * 60) + minutes) * 60 + seconds
}

fun main6() {
    println(
        intervalInSeconds(
            hours = 1,
            minutes = 20,
            seconds = 15
        )
    )  // 1 hour, 20 minutes, 15 seconds
    println(intervalInSeconds(minutes = 1, seconds = 25))              // 1 minute, 25 seconds
    println(intervalInSeconds(hours = 2))                              // 2 hours
    println(intervalInSeconds(minutes = 10))                           // 10 minutes
    println(intervalInSeconds(hours = 1, seconds = 1))                 // 1 hour, 1 second
}

/**
 * Exercise 7
 * You have a list of actions supported by a web service, a common prefix for all requests, and an ID of a particular resource. To request an action title over the
 * resource with ID: 5, you need to create the following URL: https://example.com/book-info/5/title. Use a lambda expression to create a list of URLs from the list of
 * actions.
 * fun main() {
 * val actions = listOf("title", "year", "author")
 * val prefix = "https://example.com/book-info"
 * val id = 5
 * val urls = // Write your code here
 * println(urls)
 * }
 *
 */

fun main7() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}

/**
 * 8 Exercise
 * Write a function that takes an Int value and an action (a function with type () -> Unit) which then repeats the action the given number of times. Then use this function
 * to print “Hello” 5 times.
 * fun repeatN(n: Int, action: () -> Unit) {
 * // Write your code here
 * }
 * fun main() {
 * // Write your code here
 * }
 *
 */

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

fun main8() {
    repeatN(5) {
        println("Hello")
    }
}

/**
 * Exercise 9
 * Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
 * import kotlin.math.PI
 * fun circleArea() {
 * // Write your code here
 * }
 * fun main() {
 * println(circleArea(2))
 * }
 *
 *
 */


fun circleAreaX(radius: Int): Double = PI * radius * radius

fun main9() {
    println(circleAreaX(2))
}


/**
 * Exercise 10
 * Explicitly declare the correct type for each variable:
 * fun main() {
 * val a = 1000
 * val b = "log message"
 * val c = 3.14
 * val d = 100_000_000_000_000
 * val e = false
 * val f = '\n'
 * }
 */


fun main10() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}

