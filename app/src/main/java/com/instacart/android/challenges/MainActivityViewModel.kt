package com.instacart.android.challenges

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private var itemListViewState: ItemListViewState

    init {
        val items = listOf(
            ItemRow("Cabbage"),
            ItemRow("Apple"),
            ItemRow("Bread")
        )

        itemListViewState = ItemListViewState("Delivery Items", items)
    }
}
