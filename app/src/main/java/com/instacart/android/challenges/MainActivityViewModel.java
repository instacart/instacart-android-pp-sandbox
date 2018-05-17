package com.instacart.android.challenges;

import com.instacart.android.challenges.network.DeliveryItem;

import java.util.ArrayList;

import io.reactivex.annotations.Nullable;

public class MainActivityViewModel {

    interface UpdateListener {
        void onUpdate(ItemListState state);
    }

    private ItemListState itemListState;

    private UpdateListener listener;

    public MainActivityViewModel() {
        ArrayList<DeliveryItem> deliveryItems = new ArrayList<>();
        deliveryItems.add(new DeliveryItem(1, "Cabbage", "", 1));
        deliveryItems.add(new DeliveryItem(2, "Apple", "", 5));
        deliveryItems.add(new DeliveryItem(3, "Bread", "", 2));

        itemListState = new ItemListState("Delivery Items", deliveryItems);
    }

    public void setStateUpdateListener(@Nullable UpdateListener listener) {
        this.listener = listener;

        if (listener != null) {
            listener.onUpdate(itemListState);
        }
    }
}
