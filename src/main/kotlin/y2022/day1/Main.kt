package y2022.day1

import java.io.File

fun main() {
    val allElves = mutableListOf<Int>()
    var currentTally = 0

    File("src/main/kotlin/y2022/day1/input").forEachLine(action = { str: String ->
        if (str == "") {
            allElves.add(currentTally)
            currentTally = 0
        } else {
            currentTally += str.toInt()
        }
    })

    val intArray = allElves.toIntArray()
    intArray.sortDescending()

    val partOne = intArray[0]
    val partTwo = intArray[0] + intArray[1] + intArray[2]

    println("Part one: $partOne Part two: $partTwo")
}