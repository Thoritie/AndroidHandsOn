package com.example.androidhandson.navigate

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseNavigateActivity: AppCompatActivity(){
    val logTag: String
        get() = this::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(logTag, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(logTag, "onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.i(logTag, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i(logTag, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(logTag, "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(logTag, "onDestroy")

    }

}