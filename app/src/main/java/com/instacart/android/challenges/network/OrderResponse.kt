package com.instacart.android.challenges.network

import com.google.gson.annotations.SerializedName


class OrderResponse(
    @SerializedName("items") val items: List<DeliveryItem>
)
