package com.instacart.android.challenges.network

import io.reactivex.rxjava3.core.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkApi {

    @GET("order/{order_id}")
    fun fetchOrderById(@Path("order_id") id: Long): Call<OrderResponse>

    @GET("order/{order_id}")
    fun fetchOrderByIdObservable(@Path("order_id") id: Long): Observable<OrderResponse>

    @GET("order/{order_id}")
    suspend fun fetchOrderByIdCoroutine(@Path("order_id") id: Long): OrderResponse

    @GET("orders")
    fun fetchOrders(): Call<OrdersResponse>

    @GET("orders")
    fun fetchOrdersObservable(): Observable<OrdersResponse>

    @GET("orders")
    suspend fun fetchOrdersCoroutine(): OrdersResponse

    @GET("discount/{item_id}")
    fun discount(@Path("item_id") id: Long): Call<DiscountResponse>

    @GET("discount/{item_id}")
    fun discountObservable(@Path("item_id") id: Long): Observable<DiscountResponse>

    @GET("discount/{item_id}")
    suspend fun discountCoroutine(@Path("item_id") id: Long): DiscountResponse
}
