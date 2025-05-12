package com.instacart.android.challenges.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.instacart.android.challenges.ItemRow

@Composable
fun ItemList(
    items: List<ItemRow>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewItems() {
//    ItemList(
//        listOf(
//            ItemRow(name = "Item 1"),
//            ItemRow(name = "Item 2"),
//            ItemRow(name = "Item 3"),
//        )
//    )
}