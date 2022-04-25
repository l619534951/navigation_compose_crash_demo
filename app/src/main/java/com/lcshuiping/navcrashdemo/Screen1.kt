package com.lcshuiping.navcrashdemo

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

/**
 * @author v_lichengli
 * @date 2022/4/25 3:14
 */

@Composable
fun Screen1(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            CommonBottomNavBar(navController = navController)
        }
    ) {
        Text(text = "1")
    }
}

