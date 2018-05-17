package com.instacart.android.challenges

import com.instacart.android.challenges.network.DeliveryItem


data class ItemListState(
    val title: String,
    val items: List<DeliveryItem>
)