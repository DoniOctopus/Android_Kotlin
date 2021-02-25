package com.enigmacamp.mandiricode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){

    val progresInfo = 100
    val activityName="MAIN ACTIVITY 1"
    private lateinit var pencet: Button
    private lateinit var progressInfo : ProgressBar
    private lateinit var tekan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(activityName,"OnCreate() Activity1")
        pencet = findViewById(R.id.pencet)
        tekan = findViewById(R.id.tekan)
        progressInfo = findViewById(R.id.progressBar)
        progressInfo.max = progresInfo
//        pencet.setOnClickListener(this)
//        tekan.setOnClickListener(this)
    }
    fun moveToSecondActivity(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
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

//    override fun onClick(v: View?) {
//        Log.i(v.toString(),"V dipanggil")
//        if (v == pencet){
//            CoroutineScope(Dispatchers.IO).launch{
//                for (i in 1..100){
//                    println(i)
//                    Thread.sleep(500)
//                    progressInfo.setProgress(i)
//                }
//            }
//        }
//    }
}
