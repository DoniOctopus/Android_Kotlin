package com.enigmacamp.mandiricode.service

import com.enigmacamp.mandiricode.model.Post
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface TypicodeApiService {

    @GET("posts/{id}")
    //suspend pengganti await
    //fun ini adalah fun yg bsa di async
    fun getPost(@Path("id") id:String) : Call<Post>

    @POST("post")
    fun creatPost(@Body post : Post) : Call<Post>

    @GET("posts")
    fun getAllPost(): Call<List<Post>>
}