package syntax

class OutterClass {
    val value = 1

    inner class InnerClass {
        val value = 2

        fun print() {
            println("${this@OutterClass.value}")
        }
    }
}

interface Speak {
    fun speak()
}

fun main(args: Array<String>) {
    val outter = OutterClass()
    val inner = outter.InnerClass()
    inner.print()

    val speak = object : Speak {
        override fun speak() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}