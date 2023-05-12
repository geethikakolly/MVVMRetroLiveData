package com.example.mvvmretrolivedata.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmretrolivedata.api.ApiInterface
import com.example.mvvmretrolivedata.model.Jokes

class MemesRepo(private val apiInterface: ApiInterface) {
    private val memesLiveData = MutableLiveData<Jokes>()

    //livedata define
    val memes : LiveData<Jokes>

    get() = memesLiveData
    //initialize fn to get data
    suspend fun getMemes(){
        val result = apiInterface.getJokes()
        if(result.body() != null){
            memesLiveData.postValue(result.body())
        }
    }
}