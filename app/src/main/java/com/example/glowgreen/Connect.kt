package com.example.glowgreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.glowgreen.connect.Connect
import com.example.glowgreen.connectbottombar.ConnectBottomBar
import com.example.glowgreen.createaccountbutton.CreateAccountButton
import com.example.glowgreen.ui.theme.GlowGreenTheme

@Composable
fun ConnectScreen(
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Connect()
        Column(modifier = Modifier.align(Alignment.TopCenter)) {
            Spacer(modifier = Modifier.height(70.dp))
            Image(
                painter = painterResource(R.drawable.singleplant),
                contentDescription = null,
                modifier = Modifier.height(300.dp),
                contentScale = ContentScale.FillHeight
            )
        }
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            CreateAccountButton(
                modifier = Modifier
                    .height(60.dp)
                    .width(260.dp),
                onCreateAccountButtonPressed = onButtonClick
            )
            Spacer(modifier = Modifier.height(82.dp))
            ConnectBottomBar(modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.height(40.dp))
        }

    }


}

@Preview
@Composable
fun ConnectTestPreview() {
    GlowGreenTheme{
        ConnectScreen(
            onButtonClick = {}
        )
    }
}