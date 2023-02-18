import java.security.Principal

fun main(args: Array<String>) {
//    Test #1: Capitalize words
//    println("Please enter a word or phrase: ")
//    println(capitalizeSentence(requestInput()))

//    Test #2: Return only odd numbers
//    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,12,13,111)
//    println("Initial list of numbers: $numbers")
//    println("List of odd only values: ${filterOddValues(numbers)}")

//    Test #3: Check if range 1 contains range 2
//    val firstRange = 1..9
//    val secondRange = 0..5
//
//    println("First range is: $firstRange")
//    println("Second range is: $secondRange")
//    if (containsRange(firstRange,secondRange) == true){
//        println("Range 1 contains Range 2")
//    }else println("Range 1 doesn't contain Range 2")

//    Test #4: Calculates sum of all number from 1 up to 'n'
//    adUpTo(requestInput().toInt())

//    Test #5: Return index of the item within the list of strings without using built in options
//    val l1 = listOf<String>("A","B","C","D","E","F")
//    println("We have the following list of strings: $l1")
//    print("To get the index ")
//    println(getIndex(l1,requestInput()))

//    Test #6: Return a list, containing all steps from n to 0
//    println(countDown(requestInput().toInt()))

//    Test #7: Return a list, containing all steps up from 0 to n and down to 0
    println(countUpAndDown(requestInput().toInt()))
}

/**
 * Function to request an input from a console and return result as a String
 **/
fun requestInput():String{
    println("Please enter a value: ")
    val input = readLine()?:""
    return input
}

/** Given a string, implement a function that capitalizes the first letter of every word in that string.ad
Examples:
capitalizeSentence("flower") // Flower

capitalizeSentence("this is a house") // This Is A House
 **/
fun capitalizeSentence(input: String): String {
    return input.split(" ").joinToString(" ") { it.capitalize() }
}

/** Given a list of integers, return a list that contains only odd integers (only integers that are not a multiple of 2).
Examples:
getOdd(listOf(1, 2, 3)) // 1, 3
getOdd(listOf(4, 6, 8, 7, 9)) // 7, 9
 **/

fun filterOddValues(numbers: List<Int>): List<Int>{
    return numbers.filter { it % 2 != 0 }
}

/** Given two ranges, implement a function that checks if range1 contains range2.
Examples:
containsRange(5..7, 5..7) // true
containsRange(1..12, 5..7) // true
containsRange(5..8, 5..9) // false
 */

fun containsRange(range1: IntRange, range2: IntRange): Boolean{
    return range1.first <= range2.first && range1.last >= range2.last
}

/**
 * * Given positive integer n,implement a function that calculates the sum of all numbers from 1 up to(and including) number n.
 * Examples:
 * addUpTo(1) // 1
 * addUpTo(2) // 3
 * addUpTo(3) // 6
 * */
fun adUpTo(n: Int){
    var sum = 0
    for(i in 1..n){
        sum += i
    }
println("The sum of all numbers starting from 1 up to the $n is $sum")
}

/**
 * * Given a list of strings and a string return index of the value in the list or -1 if the value was not found.
 * Don't use any Kotlin build-in methods that are directly returning index of element like indexOf/ lastIndexOf/ indexOfFirst/ indexOfLast, etc.
 * Examples:
 * getIndex(listOf("A", "B", "C"), "A") // 0
 * getIndex(listOf("A", "B", "C"), "B") // 1
 * getIndex(listOf("A", "B", "C"), "D") // -1
 * */

fun getIndex(list: List<String>,search: String): Int{
    for (i in list.indices){
        if (list[i] == search){
            return i
        }
    }
    return -1
}

/**
 * * Given positive integer n, implement a function that returns a list containing all steps from n to 0.
 * Examples:
 * countDown(1) // [1, 0]
 * countDown(4) // [4, 3, 2, 1, 0]
 * */

fun countDown(n: Int): List<Int> {
    require(n >= 0){"n must be a positive integer"}

    val result = mutableListOf<Int>()
    for (i in n downTo  0){
        result.add(i)
    }
    return result
}

/**
 * * Given positive integer n, implement a function that returns a list containing all steps up from 0 to n and down to 0.
 * Examples:
 * countUpAndDown(1) // [0, 1, 0]
 * countUpAndDown(2) // [0, 1, 2, 1, 0]*/

fun countUpAndDown(n: Int): List<Int>{
    require(n >= 0){"n must be a positive integer"}

    val result = mutableListOf<Int>()
    for (i in 0 until n){
        result.add(i)
    }
    for(i in n downTo 0){
        result.add(i)
    }
    return result
}