package com.instacart.android.challenges.network;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NetworkApi {

  @GET("orders")
  Single<OrdersResponse> fetchOrders();

  @GET("order/{order_id}")
  Single<OrderResponse> fetchOrderById(@Path("order_id") String id);

  @GET("discount/{item_id}")
  Single<DiscountResponse> discount(@Path("item_id") String id);
}