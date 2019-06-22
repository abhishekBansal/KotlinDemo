package com.abhishek.myapplication.hod

class HigherOrderFunctionKotlin {

    fun normalFun(a: Int, b: Int) {
        print(a+b)
    }

    // Method as Parameter
    fun action(str: String, action: (String) -> String): String {
        return if (str.length > 3)
            action(str)
        else str
    }

    // Method as return type
    fun action(): (Int, Int) -> Unit {
        return this::normalFun
    }

    // Consuming Method as Return type
    fun helper() {
        action().invoke(10,30)
    }

    fun doSomethingAlso(elements: List<String>): String? {
        return elements.asSequence().groupBy { it }
            .map { Pair(it.key, it.value.count()) }
            .filter { it.second % 2 == 0 }
            .takeWhile { it.first.startsWith("a") }
            .map { it.first }
            .firstOrNull()
    }
}