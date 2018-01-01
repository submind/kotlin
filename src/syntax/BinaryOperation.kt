package syntax

enum class Color (private val rgb : Int) {
    RED(0xff0000), BLUE(0x00ff00), GREEN(0x0000ff);
    fun containsRed() : Boolean {
        return this.rgb and 0xff0000 != 0
    }
}

fun main(args: Array<String>) {
    println(0x01 and 0x10 == 0)
    println(0x01 or 0x10 == 0x11)
    println(0x01 xor 0x10 == 0x11)
    println(Color.BLUE.containsRed())

    println(0b00011.inv())
}