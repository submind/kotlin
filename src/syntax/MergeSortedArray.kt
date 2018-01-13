package syntax

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var p1 = m-1
        var p2 = n-1
        var p3 = m+n-1
        while (p1 >= 0 || p2 >= 0) {
            val n1 = nums1.getOrNull(p1)?: Int.MIN_VALUE
            val n2 = nums2.getOrNull(p2)?: Int.MIN_VALUE
            if (n1 > n2) {
                nums1[p3] = n1
                p1 --
            } else {
                nums1[p3] = n2
                p2 --
            }
            p3 --
        }
    }
}

fun main(args: Array<String>) {
    val mergeSortedArray = MergeSortedArray()
    val nums1 = intArrayOf(1,2,3,4,5,6,0,0,0)
    val nums2 = intArrayOf(5,8,9)
    mergeSortedArray.merge(nums1, 6, nums2, 3)
    println(nums1.toList())
}