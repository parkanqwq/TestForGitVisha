package com.kalabukhov.app.testforgitvisha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun anyFun(): String {
        return "Hey"
    }

    private fun sum(v1: Int, v2: Int): Int {
        return v1 + v2
    }
}