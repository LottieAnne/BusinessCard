package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
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
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    BusinessCard(
        fullname = "fullname",
        title = "title",
        phone = "000-0000-0000",
        snsid = "@xxxxx",
        email = "xxx@xx.xx",
        imagePainter = painterResource(R.drawable.androidparty)
    )
}

@Composable
private fun BusinessCard(
    fullname: String,
    title: String,
    phone: String,
    snsid: String,
    email: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = Modifier.padding(32.dp),
            )
        Text(
            text = fullname,
            fontSize = 32.sp,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp),
            )
        Text(
            text = phone,
            modifier = Modifier.padding(bottom = 8.dp),
            )
        Text(
            text = snsid,
            modifier = Modifier.padding(bottom = 8.dp),
            )
        Text(
            text = email,
            modifier = Modifier.padding(bottom = 8.dp),
            )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}