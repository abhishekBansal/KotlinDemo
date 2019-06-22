package com.abhishek.myapplication.npe

class NpeKotlin {
    fun function(b: String?) = b?.length ?: -1

    fun function3(b: String?) {
        println(b?.length ?: throw IllegalArgumentException("Argument cant be null"))
    }
}