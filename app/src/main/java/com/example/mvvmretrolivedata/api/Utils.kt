package com.example.mvvmretrolivedata.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Utils {

    val BASE_URL= "https://api_imgflip.com/"

    //retrofithelper
    fun getInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}