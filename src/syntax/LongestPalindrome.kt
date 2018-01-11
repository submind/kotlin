package syntax

class Solution {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty() || s.length == 1) return s

        var max = Int.MIN_VALUE
        var si = 0
        var ei = 0
        for ((index, c) in s.withIndex()) {
            val p1 = expand(s, index, index)
            val p2 = expand(s, index, index+1)
            if (p2.second - p2.first + 1 > max) {
                max = p2.second - p2.first + 1
                si = p2.first
                ei = p2.second
            }
            if (p1.second - p1.first + 1 > max) {
                max = p1.second - p1.first + 1
                si = p1.first
                ei = p1.second
            }
        }

        return s.slice(si..ei)
    }

    private fun expand(s: String, start: Int, end: Int): Pair<Int, Int> {
        var si = start
        var ei = end
        while(si >= 0 && ei < s.length && s[si] == s[ei]){
            si --
            ei ++
        }

        return Pair(si+1, ei-1)
    }
}