package com.blannon_network.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.blannon_network.postcard.ui.theme.PostCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PostCardTheme {
               Box(
                   modifier = Modifier
                       .fillMaxSize()
                       .background(Color.Black.copy(alpha = 0.7f)),
                   contentAlignment = Alignment.Center
               ){
                   MyCard(
                       image = R.drawable.cheetah_portrait_whipsnade_zoo,
                       title = " Cheetah",
                       text = stringResource(R.string.cheetahdes),
                       publisher = Publisher(
                           name = "Blannon",
                           job = "Android Developer",
                           image = R.drawable.img_20220214_wa0013
                       )
                   )
               }
            }
        }
    }
}

