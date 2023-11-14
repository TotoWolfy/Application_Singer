package com.example.appli_singer.pages.homepage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appli_singer.pages.homepage.components.Presentation
import com.example.appli_singer.pages.homepage.components.Socials
import com.example.appli_singer.pages.homepage.components.StartButton

@Composable
fun Profil(fullName: String, windowClass: WindowSizeClass, onClick: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when (windowClass.widthSizeClass) {
            WindowWidthSizeClass.Compact -> {
                Box(contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Presentation(fullName)
                        Spacer(modifier = Modifier.height(100.dp))
                        StartButton(windowClass, onClick)
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
                            Spacer(modifier = Modifier.height(100.dp))
                            StartButton(windowClass, onClick)
                        }
                    }
                }
            }
        }
    }

}