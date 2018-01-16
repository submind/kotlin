package syntax

class LongestCommonString {
    fun longest(strs : ArrayList<String>): String {
        val shortest = strs.minBy { it.length }!!
        for ((index, c) in shortest.withIndex()) {
            val notEqual = strs.filter { it[index] != c }
            if (notEqual.isNotEmpty()) return shortest.substring(0 until index)
        }
        return shortest
    }
}

fun main(args: Array<String>) {
    val stringList = arrayListOf<String>("123", "1334","12345","123456")
    val longestCommonString = LongestCommonString()
    println("the longest common string in the list is ${longestCommonString.longest(stringList)}")
}