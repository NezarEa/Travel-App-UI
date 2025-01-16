package com.cmc.travelapp.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cmc.travelapp.ui.theme.TravelAppTheme
import com.cmc.travelapp.components.DownloadETicketComponents
import com.cmc.travelapp.components.MockAppBar
import com.cmc.travelapp.components.TicketCardComponents

class FlightDetails : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                FlightDetailsScaffold()
            }
        }
    }
}

@Preview
@Composable
fun FlightDetailsScaffold() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF8F8F8))
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                MockAppBar()
            },
            content = { innerPadding ->
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        .padding(15.dp)
                        .background(color = Color(0xFFF8F8F8))
                ) {

                    DownloadETicketComponents(
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                            .background(color = Color(0xFFF8F8F8))
                    )
                }
            }
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 170.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            TicketCardComponents(
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(8.dp))
            )
        }
    }
}

