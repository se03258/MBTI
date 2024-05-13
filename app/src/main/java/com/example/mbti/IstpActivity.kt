package com.example.mbti

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mbti.ui.theme.MBTITheme

class IstpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTITheme {
                Column {
                    val context = LocalContext.current as? Activity

                    Button(onClick = {
                        context?.finish()
                    }) {
                        Text(text = "닫기")
                    }
                    IstpScreen()
                }
            }
        }
    }
}
@Composable
fun IstpScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.istp),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = imageModifier
        )
    }
}
private val imageModifier = Modifier
    .size(500.dp)
    .border(BorderStroke(1.dp, Color.White))
    .background(Color.Transparent)