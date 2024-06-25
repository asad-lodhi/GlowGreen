package com.example.glowgreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.glowgreen.continuebutton.ContinueButton
import com.example.glowgreen.discoverplant.DiscoverPlant
import com.example.glowgreen.discoverplantbottombar.DiscoverPlantBottomBar
import com.example.glowgreen.getstartedbutton.GetStartedButton
import com.example.glowgreen.ui.theme.GlowGreenTheme
import com.example.glowgreen.welcomepagebottombar.WelcomePageBottomBar

@Composable
fun DiscoverPlantScreen(
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        DiscoverPlant(
//            onContinueButtonPressed = onButtonClick
        )
        Column(modifier = Modifier.align(Alignment.TopCenter)) {
            Spacer(modifier = Modifier.height(110.dp))
            Image(
                painter = painterResource(R.drawable.plants),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            ContinueButton(
                modifier = Modifier
                    .height(60.dp)
                    .width(194.dp),
                onContinueButtonPressed = onButtonClick
            )
            Spacer(modifier = Modifier.height(82.dp))
            DiscoverPlantBottomBar(modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Preview
@Composable
fun DiscoverPlantPreview() {
    GlowGreenTheme {
        DiscoverPlantScreen(
            onButtonClick = {}
        )
    }
}