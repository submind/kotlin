package syntax

enum class Sex {
    MALE, FEMALE
}

class Student (val name : String) {

    internal val sex : Sex = Sex.MALE

    var age : Int = 0
        set(value) {
            if(value > 0) {
                field = value
            }
        }

    // by default, without any modifier the property and function is public
    fun isAdult() : Boolean = age >= 18
}

fun main(args: Array<String>) {
    val student = Student("John")
    println(student.name)
    println(student.age)
    student.age = -1
    println(student.age)
    student.age = 20
    println(student.age)

    println(student.isAdult())
}