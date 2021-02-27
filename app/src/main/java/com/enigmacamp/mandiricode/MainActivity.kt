package com.enigmacamp.mandiricode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import com.enigmacamp.mandiricode.config.RetfofitBuilder
import com.enigmacamp.mandiricode.model.Post
import com.enigmacamp.mandiricode.service.TypicodeApiService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var typicode : TypicodeApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        typicode = RetfofitBuilder.creatRetrofit().create(TypicodeApiService::class.java)
    }

    fun showPost(view: View) {

    typicode.getPost(inputan.text.toString()).enqueue(object : Callback<Post>{

        override fun onResponse(call: Call<Post>?, response: Response<Post>?) {
        response?.apply {
            showPost.text = response?.body()?.toString()
        }
        }

        override fun onFailure(call: Call<Post>?, t: Throwable) {
            Log.i("GET POST CALL",t?.localizedMessage )
        }

    })
    }
}
