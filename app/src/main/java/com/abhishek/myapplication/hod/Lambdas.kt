package com.abhishek.myapplication.hod

import android.util.Log

class Lambdas {
    val lambda = { print("Empty Lambda take no argument and return nothing") }
    val lambda1 = { arg1: Int -> print("Empty Lambda take $arg1 Integer argument and return nothing") }
    val lambda1Return = { arg1: Int ->
        print("Empty Lambda take $arg1 Integer argument and return its square ")
        arg1 * arg1
    }

    fun main() {
        val value0 = lambda()
        val value1 = lambda1(2)
        val value2 = lambda1Return(2)
    }


    fun lamdaReturn(): () -> String {
        val abc by lazy { "ABC" }
        return { abc }
    }
}