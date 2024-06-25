package com.example.glowgreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.glowgreen.splashscreen.SplashScreen
import com.example.glowgreen.ui.theme.GlowGreenTheme

@Composable
fun SplashScreenComposed(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        SplashScreen()
        Column(modifier = Modifier.align(Alignment.TopCenter))
        {
            Spacer(modifier = Modifier.weight(0.75f))
            Image(
                painter = painterResource(R.drawable.leaves),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.25f)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.FillWidth
            )
            Spacer(modifier = Modifier.height(25.dp))
            Image(
                painter = painterResource(R.drawable.glowgreentext),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(0.6f),
                contentScale = ContentScale.FillWidth
            )
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}


@Preview
@Composable
fun SplashScreenTestPreview() {
    GlowGreenTheme {
        SplashScreenComposed()
    }
}