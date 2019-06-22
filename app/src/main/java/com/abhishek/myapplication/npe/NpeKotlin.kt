package com.abhishek.myapplication.npe

class NpeKotlin {
    fun function(b: String?) = b?.length ?: -1










































    fun function3(b: String?) {
        System.out.println(
            b?.length ?: throw IllegalArgumentException("Argument cant be null")
        )
    }
}