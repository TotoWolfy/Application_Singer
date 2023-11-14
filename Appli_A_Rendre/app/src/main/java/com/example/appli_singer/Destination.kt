package com.example.appli_singer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.appli_singer.custom_icons.FavorisIcon
import com.example.appli_singer.custom_icons.MapIcon
import com.example.appli_singer.custom_icons.ShopIcon
import com.example.appli_singer.custom_icons.ShoppingBag
import com.example.appli_singer.custom_icons.UserIcon


sealed class Destination(val destination: String, val label: String, val icon: ImageVector) {
    object VueBoutiques : Destination("vue_boutiques", "VueBoutiques", Icons.ShopIcon)
    object VuePanier : Destination("vue_panier", "VuePanier", Icons.ShoppingBag)
    object VueFavoris : Destination("vue_favoris", "VueFavoris", Icons.FavorisIcon)
    object VueProfil : Destination("vue_profil", "VueProfil", Icons.UserIcon)
    object Profil : Destination("profil", "Profil", Icons.Default.Home)
    object Carte : Destination("carte", "Carte", Icons.MapIcon)
    object CreationBoutique : Destination("creation_boutique", "CreationBoutique", Icons.Default.Search)

    object Series: Destination("series", "Séries", Icons.Default.Star)
    object Acteurs: Destination("acteurs", "Acteurs", Icons.Default.Person)
}
