package com.instacart.android.challenges

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var toolbar: Toolbar
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()

        viewModel = ViewModelProviders.of(this).get()
        viewModel.setStateUpdateListener(object : MainActivityViewModel.UpdateListener {
            override fun onUpdate(state: ItemListViewState) = renderItemList(state)
        })
    }

    private fun renderItemList(state: ItemListViewState) {

    }

    private fun bindViews() {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = ItemAdapter()
        recyclerView.adapter = adapter
    }
}
