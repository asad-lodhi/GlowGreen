package com.example.glowgreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.glowgreen.connectbottombar.ConnectBottomBar
import com.example.glowgreen.createaccountbutton.CreateAccountButton
import com.example.glowgreen.getstartedbutton.GetStartedButton
import com.example.glowgreen.ui.theme.GlowGreenTheme
import com.example.glowgreen.welcomepage.WelcomePage
import com.example.glowgreen.welcomepagebottombar.WelcomePageBottomBar

@Composable
fun WelcomePageScreen(
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.welcome_page_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(R.drawable.welcome_page_filter_filter),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        WelcomePage()
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            GetStartedButton(
                modifier = Modifier
                    .height(60.dp)
                    .width(252.dp)
                    .align(Alignment.CenterHorizontally)
                ,
                onGetStartedButtonPressed = onButtonClick
            )
            Spacer(modifier = Modifier.height(82.dp))
            WelcomePageBottomBar(modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Preview
@Composable
fun WelcomeScreenTestPreview() {
    GlowGreenTheme {
        WelcomePageScreen(
            onButtonClick = {}
        )
    }
}