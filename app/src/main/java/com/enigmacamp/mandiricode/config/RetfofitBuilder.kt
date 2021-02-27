package com.enigmacamp.mandiricode.config

import com.enigmacamp.mandiricode.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetfofitBuilder {

    //buat static object
companion object{


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