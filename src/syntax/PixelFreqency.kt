package syntax

data class Pixel(val x: Int, val y:Int)

class PixelFrequency {
    fun maxFreq(pixels: Array<Pixel>): Pixel {
        val freq = mutableMapOf<Pixel, Int>()
        for (pixel in pixels) {
            freq.put(pixel, freq.getOrElse(pixel) { 0 } + 1)
        }

        return freq.maxBy { it.value }!!.key
    }
}

fun main(args: Array<String>) {
    val pixels = arrayOf(Pixel(1,2), Pixel(1,1), Pixel(2,2), Pixel(2,2), Pixel(1,1), Pixel(1,1), Pixel(1,1))
    val pixelFreq = PixelFrequency()
    println("the most frequent pixel is ${pixelFreq.maxFreq(pixels)}")
}