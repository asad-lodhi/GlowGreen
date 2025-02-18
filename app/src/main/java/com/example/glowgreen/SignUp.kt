package com.example.glowgreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.glowgreen.signup.SignUp
import com.example.glowgreen.signupbutton.SignUpButton
import com.example.glowgreen.ui.theme.GlowGreenTheme

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {

    var firstname by remember {mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Box(modifier = Modifier.fillMaxSize()) {
        SignUp(
            signUpText = "Create Account",
            signInText = "Sign In"
        )
        Column(modifier = Modifier.align(Alignment.TopCenter)) {
            Spacer(modifier = Modifier.height(70.dp))
            Image(
                painter = painterResource(R.drawable.leaves),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(100.dp),
                contentScale = ContentScale.FillHeight
            )
            OutlinedTextField(
                value = firstname,
                onValueChange = { firstname = it },
                label = { Text("Firstname") },
                singleLine = true
            )
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedTextField(
                value = lastname,
                onValueChange = { lastname = it },
                label = { Text("Lastname") },
                singleLine = true
            )
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                singleLine = true
            )
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Username") },
                singleLine = true
            )
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation()
            )

        }
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            SignUpButton(
                modifier = Modifier
                    .height(60.dp)
                    .width(200.dp)
                ,
                signUpButtonText = "Create"
            )
            Spacer(modifier = Modifier.height(134.dp))

        }
    }
}

@Preview
@Composable
fun SignUpTestPreview() {
    GlowGreenTheme{
        SignUpScreen()
    }
}