package com.example.appli_singer.pages.homepage.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StartButton(windowClass: WindowSizeClass, onClick: () -> Unit) {
    var fontSize = 0.sp;
    var buttonHeight = 0.dp;
    var buttonWidth = 0.dp;

    when (windowClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            fontSize = 18.sp
            buttonHeight = 50.dp
            buttonWidth = 200.dp
        }

        else -> {
            fontSize = 24.sp
            buttonHeight = 70.dp
            buttonWidth = 250.dp
        }
    }
    Button(
        onClick = {
            onClick()
        },
        modifier = Modifier
            .height(buttonHeight)
            .width(buttonWidth)
            .border(BorderStroke(2.dp, Color.Black), CircleShape)
            .clip(CircleShape),
        colors = ButtonDefaults.buttonColors(Color.Magenta)
    ) {
        Text(
            text = "Démarrer",
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}
