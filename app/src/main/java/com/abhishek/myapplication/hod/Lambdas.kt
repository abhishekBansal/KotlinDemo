package com.abhishek.myapplication.hod

import android.util.Log



class Lambdas {

    val lambda = { println("No argument No return lambda") }
    val lambda1 = { arg1: Int -> print("Empty Lambda take $arg1 Integer argument and return nothing") }
    val lambda1Return = { arg1: Int -> arg1 * arg1 }

    fun main() {
        val value0 = lambda
        value0.invoke()
        value0()

        val value1 = lambda1
        lambda1(2)
        lambda1.invoke(2)

        val value2 = lambda1Return
        val answer = value2(9)

        val a = this::lamdaReturn
        a()
    }


    fun lamdaReturn(): () -> String {
        val abc by lazy { "ABC" }
        return { abc }
    }
}