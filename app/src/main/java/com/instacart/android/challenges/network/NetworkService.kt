package com.instacart.android.challenges.network

import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetworkService {
    private val retrofit: Retrofit = Builder()
        .baseUrl("https://boiling-dusk-12902.herokuapp.com/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: NetworkApi = retrofit.create(NetworkApi::class.java)
}