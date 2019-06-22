package com.abhishek.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates.observable

class MainActivity : AppCompatActivity() {

    val animationDuration: Int by lazy {
        100 * 10
    }

    var statusText: String by observable("") { prop, old, new ->
        statusTv?.text = new
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        statusText = "Waiting for animation to start"
        container.postDelayed({
//            statusText = "Running Animation"
            container.slideInFromBottom()
        }, 1000)
    }
}
