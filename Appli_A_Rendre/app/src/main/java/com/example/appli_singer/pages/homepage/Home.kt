package com.example.appli_singer.pages.homepage


import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.appli_singer.Destination


import com.example.appli_singer.R
import com.example.appli_singer.pages.main_pages.films.Films
import com.example.appli_singer.pages.main_pages.films.FilmsPages


val unboundedFamily = FontFamily(
    Font(R.font.unbounded_light, FontWeight.Light),
    Font(R.font.unbounded_regular, FontWeight.Normal),
    Font(R.font.unbounded_medium, FontWeight.Medium),
    Font(R.font.unbounded_bold, FontWeight.Bold)
)

@Composable
fun HomePage(fullName: String, windowClass: WindowSizeClass) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val destinations = listOf(Destination.Profil, Destination.Films)
    Scaffold(
        bottomBar = {
            if (currentDestination?.route != Destination.Profil.destination)
            BottomNavigation() {
                destinations.forEach { screen ->
                    BottomNavigationItem(
                        icon = { Icon(screen.icon, contentDescription = null) },
                        label = { Text(screen.label) },
                        selected =
                        currentDestination?.hierarchy?.any { it.route == screen.destination } == true,
                        onClick = { navController.navigate(screen.destination) })
                }
            }
        }) { innerPadding ->
        NavHost(
            navController, startDestination = Destination.Profil.destination,
            Modifier.padding(innerPadding)
        ) {
            composable("profil") {
                Profil(
                    fullName,
                    windowClass
                ) { navController.navigate(Destination.Films.destination) }
            }
            composable("films") { FilmsPages() }
        }
    }
}