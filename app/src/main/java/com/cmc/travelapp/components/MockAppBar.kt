package com.cmc.travelapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cmc.travelapp.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection


class CurvedBottomShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            path = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, 0f)
                lineTo(size.width, size.height)
                cubicTo(
                    size.width * 0.75f, size.height * 0.85f,
                    size.width * 0.25f, size.height * 0.85f,
                    0f, size.height
                )
                close()
            }
        )
    }
}

@Composable
fun MockAppBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(244.dp)
            .background(
                color = Color(0xFF6B4EE6),
                shape = CurvedBottomShape()
            )
    )
    Row (
        modifier = Modifier
            .padding(vertical = 25.dp, horizontal = 10.dp)
    ){
        IconButton(onClick = {  }) {
            Icon(
                painter = painterResource(id=R.drawable.li_chevron_left),
                contentDescription = "Back",
                tint = Color.White,
            )
        }
    }

    Row (
        modifier = Modifier
            .padding(horizontal = 110.dp, vertical = 80.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "bg",
            modifier = Modifier
                .fillMaxWidth()
                .width(250.dp)
                .height(75.dp)
        )
    }
}