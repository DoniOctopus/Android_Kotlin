package com.enigmacamp.mandiricode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    val activityName="MAIN ACTIVITY2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onStart() {
        super.onStart()
        Log.i(activityName,"OnStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(activityName,"OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(activityName,"OnPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(activityName,"OnStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(activityName,"OnDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(activityName,"OnRestart()")
    }
}