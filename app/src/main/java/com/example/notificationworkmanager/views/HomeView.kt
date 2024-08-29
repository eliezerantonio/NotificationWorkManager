package com.example.notificationworkmanager.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.notificationworkmanager.NotificationService
import com.example.notificationworkmanager.components.MenuLateral
import com.example.notificationworkmanager.components.TopBar

@Composable
fun HomeView(navController: NavController) {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    MenuLateral(navController = navController, drawerState = drawerState) {

        ContentHomeView(drawerState = drawerState)

    }


}

@Composable
fun ContentHomeView(drawerState: DrawerState) {

    Scaffold(
        topBar = {
            TopBar(drawerState = drawerState, title = "Home")
        }

    ) { pad ->
        NotificationsView(paddingValues = pad)

    }


}

@Composable
fun NotificationsView(paddingValues: PaddingValues) {

    val context = LocalContext.current
    val notificationService = NotificationService(context)
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Notification")

        Button(onClick = { notificationService.showBasicNotification() }) {
            Text("Basic Notification")
        }

        Button(onClick = { notificationService.showLargeNotification() }) {
            Text("Large Notification")
        }

        Button(onClick = { notificationService.showLInboxNotification() }) {
            Text("Inbox Notification")
        }

        Button(onClick = { notificationService.showImageNotification() }) {
            Text("Image Notification")
        }

    }
}