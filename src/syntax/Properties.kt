package syntax

class Student (val name : String) {
    var age : Int = 0
        set(value) {
            if(value > 0) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val student = Student("John")
    println(student.age)
    student.age = -1
    println(student.age)
    student.age = 20
    println(student.age)

}