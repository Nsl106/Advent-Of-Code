package y2022.day2

import java.io.File

fun main() {
    val partOne = mapOf(
        "A X" to 4, "A Y" to 8, "A Z" to 3,
        "B X" to 1, "B Y" to 5, "B Z" to 9,
        "C X" to 7, "C Y" to 2, "C Z" to 6
    )
    val partTwo = mapOf(
        "A X" to 3, "A Y" to 4, "A Z" to 8,
        "B X" to 1, "B Y" to 5, "B Z" to 9,
        "C X" to 2, "C Y" to 6, "C Z" to 7
    )

    var partOneScore = 0
    var partTwoScore = 0
    File("src/main/kotlin/y2022/day2/input").forEachLine(action = { str: String ->
        partOneScore += partOne[str]!!
        partTwoScore += partTwo[str]!!
    })

    println("Part one score: $partOneScore Part two score: $partTwoScore")
}