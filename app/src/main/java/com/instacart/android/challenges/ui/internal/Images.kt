package com.instacart.android.challenges.ui.internal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun RowScope.BottomBarIcons() {
    IconWithText(
        icon = Icons.Filled.ShoppingCart,
        text = "Cart"
    )
    IconWithText(
        icon = Icons.Filled.Person,
        text = "Profile"
    )
    IconWithText(
        icon = Icons.AutoMirrored.Filled.List,
        text = "My List"
    )
    IconWithText(
        icon = Icons.Filled.Search,
        text = "Search"
    )
}

@Composable
fun RowScope.IconWithText(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    text: String
) {
    Column(
        modifier = modifier
            .weight(1f)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = text,
            modifier = Modifier.size(24.dp)
        )
        Text(text = text)
    }
}

@Preview(showBackground = true, widthDp = 360)
@Composable
fun IconRowPreview() {
    Row {
        BottomBarIcons()
    }
}