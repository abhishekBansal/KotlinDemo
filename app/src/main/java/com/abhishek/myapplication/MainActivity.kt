package com.abhishek.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.abhishek.myapplication.data_classes.JavaDataClass
import com.abhishek.myapplication.data_classes.KotlinDataClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container.postDelayed ( {
            container.slideInFromBottom(animateAlpha = true)
        }, 1000)
    }

















    fun dataClassTest() {
        // KotlinDataClass
        val data = KotlinDataClass("XYZ", 26,"Delhi/NCR","ABC")

        // Java Data Class
        val dataJava = JavaDataClass( "XYZ", 26,"Delhi/NCR","ABC")
    }














    fun immutabilityUsingDataClasses() {
        val data = KotlinDataClass("XYZ", 26,"Delhi/NCR","ABC")

        // accessing the field
        data.name
        data.fatherName
        data.address
        data.age

        // setting the value
//        data.name = "ABC"
//        data.fatherName = "xyz"
//        data.address = "PQR"
//        data.age = 90

        // create new object with some data from previous object.
        // to change them you have to create new object
        // In bigger data class where you need to put builder pattern for 20 fields again and again just to create new object
        val data2 = data.copy(name = "UVW")

    }
}
