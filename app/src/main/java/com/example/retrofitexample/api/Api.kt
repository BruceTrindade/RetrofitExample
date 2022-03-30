package com.example.retrofitexample.api

import com.example.retrofitexample.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("posts/1")
    suspend fun getPost(): Response<Post>


}