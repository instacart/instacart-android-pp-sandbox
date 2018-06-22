package com.instacart.android.challenges;

import java.util.ArrayList;

import io.reactivex.annotations.Nullable;

public class MainActivityViewModel {

    interface UpdateListener {
        void onUpdate(ItemListViewState state);
    }

    private ItemListViewState itemListViewState;

    private UpdateListener listener;

    public MainActivityViewModel() {
        ArrayList<ItemRow> items = new ArrayList<>();
        items.add(new ItemRow("Cabbage"));
        items.add(new ItemRow("Apple"));
        items.add(new ItemRow("Bread"));

        itemListViewState = new ItemListViewState("Delivery Items", items);
    }

    public void setStateUpdateListener(@Nullable UpdateListener listener) {
        this.listener = listener;

        if (listener != null) {
            listener.onUpdate(itemListViewState);
        }
    }
}
