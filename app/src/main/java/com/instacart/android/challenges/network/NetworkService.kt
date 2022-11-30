package com.instacart.android.challenges.network

import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetworkService {
    private val retrofit: Retrofit = Builder()
        .baseUrl("https://instacart-challenge.glitch.me/")
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: NetworkApi = retrofit.create(NetworkApi::class.java)
}