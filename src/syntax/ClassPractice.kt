package syntax

open class Food (open val name: String, open var weight: Double) {
    fun speak() = println("I am $name")
}


class Onion(override val name: String = "Onion", override var weight: Double, val color: String): Food(name, weight)

abstract class Person(open val name: String) {
    abstract fun speak()
}

class Teacher(override val name: String): Person(name) {
    override fun speak() {
        println("Hi, I'm a teacher")
    }

}

fun main(args: Array<String>) {
    val onion = Onion(weight = 12.1, color = "Red")
    onion.speak()
    val teacher = Teacher("Lucy")
    teacher.speak()
}