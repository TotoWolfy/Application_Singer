package com.example.appli_singer.pages.homepage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import com.example.appli_singer.R
import com.example.appli_singer.pages.homepage.components.Presentation
import com.example.appli_singer.pages.homepage.components.Socials
import com.example.appli_singer.pages.homepage.components.StartButton


val unboundedFamily = FontFamily(
    Font(R.font.unbounded_light, FontWeight.Light),
    Font(R.font.unbounded_regular, FontWeight.Normal),
    Font(R.font.unbounded_medium, FontWeight.Medium),
    Font(R.font.unbounded_bold, FontWeight.Bold)
)


@Composable
fun HomePage(fullName: String, windowClass: WindowSizeClass) {
    when (windowClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            Box(contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Presentation(fullName)
                    Spacer(modifier = Modifier.height(50.dp))
                    Socials(windowClass)
                    Spacer(modifier = Modifier.height(100.dp))
                    StartButton(windowClass)
                }
            }
        }

        else -> {
            Box(contentAlignment = Alignment.Center) {
                Row() {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Presentation(fullName)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Socials(windowClass)
                        Spacer(modifier = Modifier.height(100.dp))
                        StartButton(windowClass)
                    }
                }
            }
        }
    }
}