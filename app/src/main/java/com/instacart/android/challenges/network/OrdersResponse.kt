package com.instacart.android.challenges.network

import com.google.gson.annotations.SerializedName


class OrdersResponse(
    @SerializedName("orders") val orders: List<Long>
)
