package com.lcshuiping.navcrashdemo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

/**
 * @author v_lichengli
 * @date 2022/4/25 3:14
 */
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Sc1.route
    ) {
        composable(Screen.Sc1.route) {
            Screen1(navController = navController)
        }
        composable(Screen.Sc2.route) {
            Screen2(navController = navController)
        }
    }
}




sealed class Screen(val route: String) {
    object Sc1 : Screen("calc-tool")
    object Sc2 : Screen("minutely-monitor")
}
