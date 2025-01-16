package com.cmc.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.text.font.FontWeight


class FlightListing : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}



@Composable
fun MainScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Box{
            Image(
                painter = painterResource(id = R.drawable.rectangle_18),
                contentDescription = "bg",
                modifier = Modifier.fillMaxWidth()
            )
            TopBar()
            TicketContent()
        }
        Divider(color = Color.Gray, thickness = 1.dp)
        HorizontalButtonInterface()
        Divider(color = Color.Gray, thickness = 1.dp)

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(sampleItems) { item ->
                ItemRow(item = item)
            }
        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(id = R.drawable.li_chevron_left),
                contentDescription = "Back",
                tint = Color.White
            )
        }

        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(id = R.drawable.li_edit),
                contentDescription = "Edit",
                tint = Color.White
            )
        }
    }
}

@Composable
fun TicketContent() {
    Column(
        modifier = Modifier
            .padding(18.dp)
            .padding(horizontal = 12.dp, vertical = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "20 December 2022",
            color = Color.White,
            fontSize = 16.sp
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "DEL",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            FlightIcon()

            Text(
                text = "BLR",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                "Bengaluru Airport India",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 10.sp
            )

            Text(
                text = "04h 30m",
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "Delhi International Airport",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 10.sp
            )
        }


        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Icon(
                painter = painterResource(id=R.drawable.li_user),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(16.dp)
            )
            Text(
                text = "01 Adult",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 4.dp)
            )
        }
    }
}

@Composable
fun FlightIcon() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(2.dp)
                .background(Color.White.copy(alpha = 0.5f))
        )
        Icon(
            painter = painterResource(id= R.drawable.li_plane),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(2.dp)
                .background(Color.White.copy(alpha = 0.5f))
        )
    }
}

@Composable
fun HorizontalButtonInterface() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .height(40.dp)
                .weight(1f),
            shape = RoundedCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)
        ) {
            Text("Low to high", fontSize = 9.sp, color = Color.Black)
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .height(40.dp)
                .weight(1f),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)
        ) {
            Text("High to low", fontSize = 10.sp, color = Color.Black)
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .height(40.dp)
                .weight(1f),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)
        ) {
            Text("Airlines Type", fontSize = 10.sp, color = Color.Black)
        }
        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = R.drawable.filtre),
            contentDescription = "Filter",
            modifier = Modifier
                .size(30.dp)
        )
    }
}

@Composable
fun ItemRow(item: Item) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        colors = androidx.compose.material3.CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = item.imageRes),
                    contentDescription = "Image",
                    modifier = Modifier
                        .size(35.dp)
                        .padding(end = 8.dp)
                )
                Text(
                    text = item.title,
                    fontSize = 10.sp,
                    color = Color.Gray,
                    modifier = Modifier.weight(1f)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = item.del,
                            fontSize = 16.sp,
                            color = Color.Black
                        )
                        Text(
                            text = item.time,
                            fontSize = 16.sp,
                            color = Color(0xFF955CE1)
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = item.d_time,
                            fontSize = 16.sp,
                            color = Color.Black
                        )
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = item.blr,
                            fontSize = 16.sp,
                            color = Color.Black
                        )
                        Image(
                            painter = painterResource(id = R.drawable.pricetag),
                            contentDescription = "Flight Icon",
                            modifier = Modifier
                                .size(24.dp)
                        )
                        Text(
                            text = item.nbr,
                            fontSize = 16.sp,
                            color = Color.Black
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = item.a_time,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Free Meal",
                    fontSize = 9.sp,
                    color = Color.LightGray
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = item.description,
                    fontSize = 10.sp,
                    color = Color.Green
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6F6F6))
    ) {
        MainScreen()
    }
}

val sampleItems = listOf(
    Item(R.drawable.icon1, "Indigo", "DEL", "06:30", "04h 15m", "BLR", "10:45", "7,319", "Use Code : Flyaway60 and get 60% instant cashback"),
    Item(R.drawable.icon2, "Vistara", "DEL", "07:15", "02h 25m", "BLR", "09:40", "7,319", "Use Code : Flyaway60 and get 60% instant cashback"),
    Item(R.drawable.icon3, "Spicejet", "DEL", "07:55", "02h 10m", "BLR ", "10:05", "7,319", "User GIUNIQUE and get Rs.250 instant discount"),
    Item(R.drawable.icon1, "Indigo", "DEL", "06:30", "04h 15m", "BLR", "10:45", "7,319", "Use Code : Flyaway60 and get 60% instant cashback"),
    Item(R.drawable.icon2, "Vistara", "DEL", "07:15", "02h 25m", "BLR", "09:40", "7,319", "Use Code : Flyaway60 and get 60% instant cashback"),
    Item(R.drawable.icon3, "Spicejet", "DEL", "07:55", "02h 10m", "BLR ", "10:05", "7,319", "User GIUNIQUE and get Rs.250 instant discount")
)
