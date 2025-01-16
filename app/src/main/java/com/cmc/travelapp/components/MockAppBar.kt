package com.cmc.travelapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cmc.travelapp.R

@Composable
fun MockAppBar() {
    Box{
        Image(
            painter = painterResource(id = R.drawable.rectangle_18),
            contentDescription = "bg",
            modifier = Modifier.fillMaxWidth()
        )

        Row (
            modifier = Modifier
                .padding(vertical = 10.dp)
        ){
            IconButton(onClick = {  }) {
                Icon(
                    painter = painterResource(id=R.drawable.li_chevron_left),
                    contentDescription = "Back",
                    tint = Color.White
                )
            }
        }

        Row (
            modifier = Modifier
                .padding(horizontal = 110.dp, vertical = 80.dp)
        ){
            Text(
                text = "IndiGo",
                color = Color.White,
                fontSize = 52.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}