package com.instacart.android.challenges.network

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkApi {

    @GET("orders")
    fun fetchOrders(): Call<OrdersResponse>

    @GET("orders")
    fun fetchOrdersObservable(): Observable<OrdersResponse>

    @GET("order/{order_id}")
    fun fetchOrderById(@Path("order_id") id: Long): Call<OrderResponse>

    @GET("order/{order_id}")
    fun fetchOrderByIdObservable(@Path("order_id") id: Long): Observable<OrderResponse>

    @GET("discount/{item_id}")
    fun discount(@Path("item_id") id: Long): Call<DiscountResponse>

    @GET("discount/{item_id}")
    fun discountObservable(@Path("item_id") id: Long): Observable<DiscountResponse>
}
