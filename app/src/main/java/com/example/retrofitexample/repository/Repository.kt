package com.example.retrofitexample.repository

import com.example.retrofitexample.api.RetrofitInstance
import com.example.retrofitexample.model.Post
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun pushPost(post: Post): Response<Post> {
        return RetrofitInstance.api.pushPost(post)
    }

    suspend fun pushPost2(userID: Int, id: Int, title: String, body: String): Response<Post> {
        return RetrofitInstance.api.pushPost2(userID, id, title, body)
    }
}