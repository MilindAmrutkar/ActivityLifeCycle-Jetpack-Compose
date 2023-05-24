package com.backtocding.activitylifecycle

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity

class SecondActivity: ComponentActivity() {
    
    private val TAG = "Logging SecondActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "==========================================")
        Log.d(TAG, "onCreate: SecondActivity")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: SecondActivity")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState: SecondActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: SecondActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: SecondActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: SecondActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: SecondActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: SecondActivity")
    }
}