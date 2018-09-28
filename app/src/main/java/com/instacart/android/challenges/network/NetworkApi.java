package com.instacart.android.challenges.network;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NetworkApi {

    @GET("orders")
    Call<OrdersResponse> fetchOrders();

    @GET("orders")
    Observable<OrdersResponse> fetchOrdersObservable();

    @GET("order/{order_id}")
    Call<OrderResponse> fetchOrderById(@Path("order_id") long id);

    @GET("order/{order_id}")
    Observable<OrderResponse> fetchOrderByIdObservable(@Path("order_id") long id);

    @GET("discount/{item_id}")
    Call<DiscountResponse> discount(@Path("item_id") long id);

    @GET("discount/{item_id}")
    Observable<DiscountResponse> discountObservable(@Path("item_id") long id);
}
