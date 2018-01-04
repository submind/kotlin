package syntax

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var right = 0
        var maxLength = 0
        val charToIndex = mutableMapOf<Char, Int>()
        while (left <= right && right < s.length) {
            if (s[right] in charToIndex){
                left = Math.max(charToIndex[s[right]]!!, left)
            }
            maxLength = Math.max(right - left + 1, maxLength)
            charToIndex[s[right]] = right + 1
            right ++
        }

        return maxLength
    }

}

fun main(args: Array<String>) {
    val longestSubstringWithoutRepeatingCharacters = LongestSubstringWithoutRepeatingCharacters()
    println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abba"))
}