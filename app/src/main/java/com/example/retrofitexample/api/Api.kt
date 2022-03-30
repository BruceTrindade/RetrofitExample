package com.example.retrofitexample.api

import com.example.retrofitexample.model.Post
import retrofit2.Response
import retrofit2.http.*

interface Api {

    @GET("posts/1")
    suspend fun getPost(): Response<Post>

    @POST("posts")
    suspend fun pushPost(
        @Body post: Post
    ): Response<Post>

    @FormUrlEncoded
    @POST("posts")
    suspend fun pushPost2(
        @Field("userID") userID: Int,
        @Field("id") id: Int,
        @Field("title") title: String,
        @Field("body") body: String,
    ): Response<Post>

}