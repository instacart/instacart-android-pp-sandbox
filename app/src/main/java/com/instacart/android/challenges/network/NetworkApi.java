package com.instacart.android.challenges.network;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NetworkApi {

  // Note : Feel free to use LiveData, RxJava, Coroutines, or whatever other tech works for you in order to interact with this API

  @GET("orders")
  Call<OrdersResponse> fetchOrders();

  @GET("order/{order_id}")
  Call<OrderResponse> fetchOrderById(@Path("order_id") long id);

  @GET("discount/{item_id}")
  Call<DiscountResponse> discount(@Path("item_id") long id);
}