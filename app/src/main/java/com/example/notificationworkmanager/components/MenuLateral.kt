package com.example.notificationworkmanager.components

import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.example.notificationworkmanager.navigation.MenuItems
import kotlinx.coroutines.launch

@Composable
fun MenuLateral(
    navController: NavController,
    drawerState: DrawerState,
    content: @Composable () -> Unit,
) {

    val scope = rememberCoroutineScope()

    val itemsMenu = listOf(MenuItems.item_1, MenuItems.item_2, MenuItems.item_3)

    ModalNavigationDrawer(

        drawerState = drawerState,

        drawerContent = {

            ModalDrawerSheet {
                itemsMenu.forEach { item ->

                    NavigationDrawerItem(
                        icon = { Icon(item.icon, contentDescription = "") },
                        label = { Text(text = item.title) }, selected = false, onClick = {

                            scope.launch {
                                drawerState.close()
                            }
                            navController.navigate(item.route)
                        })
                }
            }
        }) {

        content()

    }


}