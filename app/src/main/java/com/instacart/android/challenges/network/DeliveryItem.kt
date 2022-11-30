package com.instacart.android.challenges.network

import com.google.gson.annotations.SerializedName

data class DeliveryItem(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("count") val count: Int
)
