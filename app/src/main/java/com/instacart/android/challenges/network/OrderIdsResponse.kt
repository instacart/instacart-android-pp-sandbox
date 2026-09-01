package com.instacart.android.challenges.network

import com.google.gson.annotations.SerializedName


class OrderIdsResponse(
    @SerializedName("orders") val orderIds: List<Long>
)
