package com.example.appli_singer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Destination(val destination: String, val label: String, val icon: ImageVector) {
    object Profil : Destination("profil", "Profil", Icons.Default.Home)
    object Films : Destination("films", "Films", Icons.Default.Search)
    object Series: Destination("series", "Séries", Icons.Default.Star)
    object Acteurs: Destination("acteurs", "Acteurs", Icons.Default.Person)
}
