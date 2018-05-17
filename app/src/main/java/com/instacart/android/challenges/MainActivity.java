package com.instacart.android.challenges;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemListScreen screen = new ItemListScreen(findViewById(R.id.item_screen_container));

        MainActivityViewModel viewModel = new MainActivityViewModel();
        viewModel.setStateUpdateListener(state -> {
            screen.render(state);
        });
    }
}
