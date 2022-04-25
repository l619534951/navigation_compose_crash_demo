package com.lcshuiping.navcrashdemo

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState

/**
 * @author v_lichengli
 * @date 2022/4/25 3:14
 */
@Composable
fun Screen2(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            CommonBottomNavBar(navController = navController)
        }
    ) {
        Text(text = "2")
    }
}
