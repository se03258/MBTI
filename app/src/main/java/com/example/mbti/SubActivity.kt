package com.example.mbti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import com.example.mbti.ui.theme.MBTITheme

class SubActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTITheme {
                Column {
                    val context = LocalContext.current as? Activity

                    Button(onClick = {
                        val intent = Intent(context, EntpActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "ENTP")
                    }
                    Button(onClick = {
                        val intent = Intent(context, IstpActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "ISTP")
                    }
                    Button(onClick = {
                        val intent = Intent(context, EnfjActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "ENFJ")
                    }
                    Button(onClick = {
                        context?.finish()
                    }) {
                        Text(text = "닫기")
                    }
                }
            }
        }
    }
}