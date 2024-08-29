package com.example.notificationworkmanager.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class MenuItems(
    val icon: ImageVector,
    val title: String,
    val route: String,
) {
    data object item_1 : MenuItems(Icons.Default.Home, "Home", "Home")
    data object item_2 : MenuItems(Icons.Default.CheckCircle, "About", "About")
    data object item_3: MenuItems(Icons.Default.AccountCircle,"Account","Account")

}