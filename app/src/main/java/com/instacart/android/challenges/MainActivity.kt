package com.instacart.android.challenges

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    private val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        viewModel.setStateUpdateListener(
            object : MainActivityViewModel.UpdateListener {
                override fun onUpdate(state: ItemListViewState) {
                    renderItemList(state)
                }
            }
        )
    }

    @OptIn(ExperimentalMaterial3Api::class)
    private fun renderItemList(state: ItemListViewState) {
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(state.title) })
                }
            ) { padding ->
                Column(
                    modifier = Modifier
                        .padding(padding)
                ) {

                }
            }
        }
    }
}