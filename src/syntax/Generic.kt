package syntax

class Stack<T>(vararg items : T) {

    private val elements = items.toMutableList()

    fun push(value : T) {
        elements.add(value)
    }

    fun pop(): T? {
        if (isEmpty()) return null
        return elements.removeAt(elements.size - 1)
    }

    private fun isEmpty() : Boolean {
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg items : T): Stack<T> {
    return Stack(*items)
}

fun main(args: Array<String>) {
    val stack = Stack(1,2,3,4,5)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    stack.push(6)
    println(stack.pop())

    val stack2 = stackOf("hello", "world")
    println(stack2.pop())
    println(stack2.pop())
    println(stack2.pop())
}