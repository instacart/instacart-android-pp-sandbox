package com.instacart.android.challenges.network;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NetworkApi {

  @GET("orders")
  Observable<OrdersResponse> fetchOrders();

  @GET("order/{order_id}")
  Observable<OrderResponse> fetchOrderById(@Path("order_id") long id);

  @GET("discount/{item_id}")
  Observable<DiscountResponse> discount(@Path("item_id") long id);
}