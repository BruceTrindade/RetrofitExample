package com.example.retrofitexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitexample.model.Post
import com.example.retrofitexample.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel()  {

    val myResponse: MutableLiveData<Response<Post>> = MutableLiveData()

    fun pushPost(post: Post ){
        viewModelScope.launch {
            val response: Response<Post> = repository.pushPost(post)
            myResponse.value = response
        }
    }

    fun pushPost2(userID: Int, id: Int, title: String, body: String){
        viewModelScope.launch {
            val response: Response<Post> = repository.pushPost2(userID, id, title, body)
            myResponse.value = response
        }
    }

    fun getPost() {
        viewModelScope.launch {
            val response: Response<Post> = repository.getPost()
            myResponse.value = response
        }
     }
}