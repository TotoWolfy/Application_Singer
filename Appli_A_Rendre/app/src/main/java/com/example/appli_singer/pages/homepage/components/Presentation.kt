package com.example.appli_singer.pages.homepage.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appli_singer.R
import com.example.appli_singer.pages.homepage.unboundedFamily

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