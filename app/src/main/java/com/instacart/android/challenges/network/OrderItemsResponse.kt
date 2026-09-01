package com.instacart.android.challenges.network

import com.google.gson.annotations.SerializedName


class OrderItemsResponse(
    @SerializedName("items") val items: List<OrderItem>
)
