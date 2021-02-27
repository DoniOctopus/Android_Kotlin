package com.enigmacamp.mandiricode.model

import com.google.gson.annotations.SerializedName

data class Post (
    //memakai data kelas sudah tidak harius memakai equels hascode karena datanya unik
    //() sebuah contraktor
    val body: String,
    val id: Int,
    val title: String,
    @SerializedName("userId")
    val myUserId: Int = 0)
