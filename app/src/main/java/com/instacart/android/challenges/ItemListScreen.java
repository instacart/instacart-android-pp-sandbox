package com.instacart.android.challenges;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ItemListScreen {
    private final Toolbar toolbar;
    private final RecyclerView recyclerView;

    private final ItemAdapter adapter;

    public ItemListScreen(View parent) {
        this.toolbar = parent.findViewById(R.id.toolbar);

        recyclerView = parent.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(parent.getContext(), LinearLayoutManager.VERTICAL, false));;

        adapter = new ItemAdapter();
        recyclerView.setAdapter(adapter);
    }

    public void render(ItemListState state) {

    }
}
