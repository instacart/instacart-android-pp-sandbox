package com.instacart.android.challenges.network

import io.reactivex.rxjava3.core.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkApi {

    @GET("order/{order_id}")
    fun fetchOrderItems(@Path("order_id") id: Long): Call<OrderItemsResponse>

    @GET("order/{order_id}")
    fun fetchOrderItemsObservable(@Path("order_id") id: Long): Observable<OrderItemsResponse>

    @GET("order/{order_id}")
    suspend fun fetchOrderItemsCoroutine(@Path("order_id") id: Long): OrderItemsResponse

    @GET("orders")
    fun fetchOrderIds(): Call<OrderIdsResponse>

    @GET("orders")
    fun fetchOrderIdsObservable(): Observable<OrderIdsResponse>

    @GET("orders")
    suspend fun fetchOrderIdsCoroutine(): OrderIdsResponse

    @GET("price/{item_id}")
    fun price(@Path("item_id") id: Long): Call<PriceResponse>

    @GET("price/{item_id}")
    fun priceObservable(@Path("item_id") id: Long): Observable<PriceResponse>

    @GET("price/{item_id}")
    suspend fun priceCoroutine(@Path("item_id") id: Long): PriceResponse
}
