package com.example.appli_singer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


val unboundedFamily = FontFamily(
    Font(R.font.unbounded_light, FontWeight.Light),
    Font(R.font.unbounded_regular, FontWeight.Normal),
    Font(R.font.unbounded_medium, FontWeight.Medium),
    Font(R.font.unbounded_bold, FontWeight.Bold)
)


@Composable
fun HomePage(fullName: String, windowClass: WindowSizeClass, modifier: Modifier = Modifier) {
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

@Composable
fun Presentation(fullName: String, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.fabien),
        contentDescription = "Ma photo de profil",
        modifier = modifier
            .size(150.dp)
            .border(BorderStroke(2.dp, Color.Black), CircleShape)
            .clip(CircleShape)
    )
    Spacer(modifier = Modifier.height(15.dp))
    Text(
        text = "$fullName",
        fontSize = 32.sp,
        fontFamily = unboundedFamily,
        fontWeight = FontWeight.Bold,
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Étudiant en 3ème année de BUT MMI \n" + "IUT Paul Sabatier - Castres",
        textAlign = TextAlign.Center,
        fontSize = 17.sp,
        fontFamily = unboundedFamily,
        fontWeight = FontWeight.Normal,
    )
}

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

@Composable
fun StartButton(windowClass: WindowSizeClass) {
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
        onClick = { /*TODO*/ },
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