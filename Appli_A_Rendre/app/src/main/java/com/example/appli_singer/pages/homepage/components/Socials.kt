package com.example.appli_singer.pages.homepage.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appli_singer.R

@Composable
fun Socials(windowClass: WindowSizeClass, modifier: Modifier = Modifier) {
    var fontSize = 0.sp;
    var iconSize = 0.dp;
    var spacerHeight = 0.dp;
    var spacerWidth = 0.dp;

    when (windowClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            fontSize = 16.sp
            iconSize = 20.dp
            spacerHeight = 10.dp
            spacerWidth = 10.dp
        }

        else -> {
            fontSize = 18.sp
            iconSize = 30.dp
            spacerHeight = 20.dp
            spacerWidth = 20.dp
        }
    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.Start) {
            Image(
                painter = painterResource(R.drawable.e_mail),
                contentDescription = "Logo email",
                modifier = modifier.size(iconSize)
            )
            Spacer(modifier = Modifier.height(spacerHeight))
            Image(
                painter = painterResource(R.drawable.linkedin),
                contentDescription = "Logo Linkedin",
                modifier = modifier.size(iconSize)
            )
            Spacer(modifier = Modifier.height(spacerHeight))
            Image(
                painter = painterResource(R.drawable.github_logo),
                contentDescription = "Logo Github",
                modifier = modifier.size(iconSize)
            )
        }
        Spacer(modifier = Modifier.width(spacerWidth))
        Column(horizontalAlignment = Alignment.Start) {
            Text(
                text = "hombert.fabien@gmail.com",
                fontSize = fontSize,
            )

            Spacer(modifier = Modifier.height(spacerHeight))
            Text(
                text = "https://www.linkedin.com/in/fabien-hombert",
                fontSize = fontSize,
            )

            Spacer(modifier = Modifier.height(spacerHeight))
            Text(
                text = "https://github.com/Picoche",
                fontSize = fontSize,
            )
        }
    }
}