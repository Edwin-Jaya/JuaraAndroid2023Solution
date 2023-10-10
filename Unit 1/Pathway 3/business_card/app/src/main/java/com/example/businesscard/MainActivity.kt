package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier){
    val android_logo = painterResource(R.drawable.android_robot_head)
    val linkedinlogo = painterResource(R.drawable.linkedin)
    val instagramlogo = painterResource(R.drawable.instagram)
    val mediumlogo = painterResource(R.drawable.medium)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.weight(850f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = android_logo,
                contentDescription = null
            )
            Text(
                text = "Edwin Liona Jaya",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp
            )
            Text(
                text = "Android Developer",
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
        Column(
            Modifier.padding(bottom=16.dp, start = 20.dp)
        ) {
            Row() {
                Image(painter = linkedinlogo,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp))
                Text(text = "https://www.linkedin.com/in/edwin-jaya-31bb0b248/",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start=8.dp,top=6.dp))
            }
            Row(Modifier.padding(top=15.dp)) {
                Image(painter = instagramlogo,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp))
                Text(text = "https://medium.com/@edwinjaya",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start=8.dp,top=6.dp))
            }
            Row(Modifier.padding(top=15.dp)){
                Image(painter = mediumlogo,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp))
                Text(text = "https://www.instagram.com/edwinjaya.py/",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start=8.dp,top=6.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}