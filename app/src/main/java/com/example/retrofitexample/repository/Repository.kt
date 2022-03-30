package com.example.retrofitexample.repository

import com.example.retrofitexample.api.RetrofitInstance
import com.example.retrofitexample.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}