package com.example.notificationworkmanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notificationworkmanager.views.AboutView
import com.example.notificationworkmanager.views.AccountView
import com.example.notificationworkmanager.views.HomeView

@Composable
fun NavManager(){
    val navController= rememberNavController()
    
    NavHost(navController = navController, startDestination = "Home" ){
        composable("Home"){
            HomeView(navController =navController )
        }
        composable("About"){
            AboutView()
        }
        composable("Account"){
            AccountView()
        }
    }


}