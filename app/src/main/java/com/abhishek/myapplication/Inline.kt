package com.abhishek.myapplication

class Inline {
    inline fun <R> CharSequence.map(transform: (Char) -> R): List<R> {
        return mapTo(ArrayList<R>(length), transform)
    }

    fun main() {
        val s = "12345"
        s.map { it.toInt() }
            .last()
    }
}