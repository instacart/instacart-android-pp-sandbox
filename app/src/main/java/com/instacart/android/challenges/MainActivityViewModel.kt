package com.instacart.android.challenges

import io.reactivex.annotations.Nullable

class MainActivityViewModel {

    interface UpdateListener {
        fun onUpdate(state: ItemListViewState)
    }

    private val itemListViewState: ItemListViewState
    private var listener: UpdateListener? = null

    init {
        val items = listOf(
            ItemRow("Cabbage"),
            ItemRow("Apple"),
            ItemRow("Bread")
        )

        itemListViewState = ItemListViewState("Delivery Items", items)
    }

    fun setStateUpdateListener(@Nullable listener: UpdateListener?) {
        this.listener = listener

        listener?.onUpdate(itemListViewState)
    }
}
