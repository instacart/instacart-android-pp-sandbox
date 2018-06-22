package com.instacart.android.challenges;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ItemAdapter adapter;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View itemScreenContainerView = findViewById(R.id.item_screen_container);
        bindViews(itemScreenContainerView);

        MainActivityViewModel viewModel = new MainActivityViewModel();
        viewModel.setStateUpdateListener(state -> {
            renderItemList(state);
        });
    }

    private void renderItemList(ItemListViewState state) { }

    private void bindViews(View parent) {
        toolbar = parent.findViewById(R.id.toolbar);

        recyclerView = parent.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(parent.getContext(), LinearLayoutManager.VERTICAL, false));;

        adapter = new ItemAdapter();
        recyclerView.setAdapter(adapter);
    }
}
