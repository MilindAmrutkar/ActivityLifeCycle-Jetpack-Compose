package com.backtocding.activitylifecycle

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.backtocding.activitylifecycle.ui.theme.ActivityLifeCycleTheme

class MainActivity : ComponentActivity() {
    val TAG = "Logging MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "==========================================")
        Log.d(TAG, "onCreate: MainActivity")
        var level = 0
        var score = 0
        if (savedInstanceState != null) {
            score = savedInstanceState.getInt("score")
            level = savedInstanceState.getInt("level")
        }
        Log.d(TAG, "onCreate: score = $score level = $level")


        setContent {
            ActivityLifeCycleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val context = LocalContext.current
                    Greeting() {
                        context.startActivity(Intent(context, SecondActivity::class.java))
                    }
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: MainActivity")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: MainActivity")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: MainActivity")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: MainActivity")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: MainActivity")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: MainActivity")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: MainActivity")
        outState.putInt("level", 1)
        outState.putInt("score", 10)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val score = savedInstanceState.getInt("score")
        val level = savedInstanceState.getInt("level")
        Log.d(TAG, "onRestoreInstanceState: score = $score level = $level")
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier, onButtonClick: () -> Unit) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp),
        onClick = {
        onButtonClick()
    }) {
        Text(text = "Click Me")
    }
}