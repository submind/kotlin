package syntax

fun main(args: Array<String>) {

    print("Enter a word to guess: ")

    val input: String? = readLine()

    if (input == null) {
        println("No word input. Game ends.")
        return
    }

    val letters = input.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var failedGuess = 0

    for (i in 1..100) {
        println()
    }

    while (correctGuesses != letters) {
        print("Please enter a character: ")
        var character = readLine()
        if (character == null || character.length != 1) {
            println("Please enter a character instead.")
            continue
        }

        if (letters.contains(character[0].toLowerCase())) {
            correctGuesses.add(character[0].toLowerCase())
        } else {
            failedGuess++
        }

        printExploredWord(input, correctGuesses)
        println("Failed guesses: $failedGuess")
    }

    println("Well done!")
    println("Failed guesses: $failedGuess")
}

fun printExploredWord(word : String, correctGuess : Set<Char>) {
    for (letter in word.toLowerCase()) {
        if (correctGuess.contains(letter)) {
            print(letter)
        } else {
            print("_")
        }
        print(" ")
    }
    println()
}