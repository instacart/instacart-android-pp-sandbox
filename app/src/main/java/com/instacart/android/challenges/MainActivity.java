package com.instacart.android.challenges;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        viewModel.setStateUpdateListener(this::renderItemList);
    }

    private void renderItemList(ItemListViewState state) { }

    private void bindViews(View parent) {
        toolbar = parent.findViewById(R.id.toolbar);

        recyclerView = parent.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(parent.getContext(), RecyclerView.VERTICAL, false));;

        adapter = new ItemAdapter();
        recyclerView.setAdapter(adapter);
    }
}
