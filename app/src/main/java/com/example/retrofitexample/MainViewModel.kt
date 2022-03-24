package com.example.retrofitexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitexample.model.Post
import com.example.retrofitexample.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel()  {

    val myResponse: MutableLiveData<Post> = MutableLiveData()
    fun getPost() {
        viewModelScope.launch {
            val response: Post = repository.getPost()
            myResponse.value = response
        }
     }
}