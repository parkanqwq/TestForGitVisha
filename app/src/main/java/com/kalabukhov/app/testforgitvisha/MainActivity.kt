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

    private fun sum(v1: Int,v2: Int): Int {
        val vc1 = v1 + 1
        val vc2 = v2 + 1
        return vc1 + vc2
    }

    private fun text3() {

    }
}