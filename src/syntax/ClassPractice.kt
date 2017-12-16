package syntax

open class Food (open val name: String, open var weight: Double) {
    fun speak() = println("I am $name")
}


class Onion(override val name: String = "Onion", override var weight: Double, val color: String): Food(name, weight)

fun main(args: Array<String>) {
    val onion = Onion(weight = 12.1, color = "Red")
    onion.speak()
}