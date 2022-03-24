package com.example.retrofitexample.repository

import com.example.retrofitexample.api.RetrofitInstance
import com.example.retrofitexample.model.Post

class Repository {

    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }
}