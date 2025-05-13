package com.instacart.android.challenges

data class ItemListViewState(
    val title: String,
    val items: List<ItemRow>
)

data class ItemRow(
    val name: String,
)