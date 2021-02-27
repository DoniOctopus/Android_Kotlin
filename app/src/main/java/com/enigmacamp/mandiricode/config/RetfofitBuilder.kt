package com.enigmacamp.mandiricode.config

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetfofitBuilder {

    //buat static object
companion object{
        //panggil si URLnya
    var BASE_URL = "https://jsonplaceholder.typicode.com"

        //buat retrofinya
    fun creatRetrofit() : Retrofit {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                //pakai Gsonya setelah Base URL dipanggil
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit
        }
    }
}