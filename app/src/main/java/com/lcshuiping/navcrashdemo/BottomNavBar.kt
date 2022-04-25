package com.lcshuiping.navcrashdemo

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

/**
 * @author v_lichengli
 * @date 2022/4/25 3:18
 */
@Composable
fun CommonBottomNavBar(navController: NavHostController) {
    val items = listOf(Screen.Sc1, Screen.Sc2)
    val icons = listOf(Icons.Rounded.Search, Icons.Rounded.Settings)
    val labels = listOf("label1", "label2")

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        items.forEachIndexed { index, screen ->
            BottomNavigationItem(
                selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                label = { Text(text = labels[index]) },
                icon = { Icon(imageVector = icons[index], contentDescription = labels[index]) }
            )
        }
    }
}
