package syntax

class BuyAndSellStockIII {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0

        val left = IntArray(prices.size)
        var min = prices[0]
        left[0] = 0
        for (i in 1 until prices.size) {
            min = Math.min(min, prices[i])
            left[i] = Math.max(left[i - 1], prices[i] - min)
        }

        var right = IntArray(prices.size)
        var max = prices[prices.size - 1]
        right[prices.size - 1] = 0
        for (i in prices.size - 2 downTo 0) {
            max = Math.max(max, prices[i])
            right[i] = Math.max(right[i+1], max - prices[i])
        }

        return (0 until prices.size)
                .map { left[it] + right[it] }
                .max()
                ?: 0
    }
}

fun main(args: Array<String>) {
    val buyAndSellStock = BuyAndSellStockIII()
    val input = intArrayOf(2, 1, 2, 0, 1)
    println(buyAndSellStock.maxProfit(input))

    println(minOf(2,1))
    println(maxOf(2,3))
}