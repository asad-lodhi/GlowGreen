package com.example.glowgreen

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.glowgreen.splashscreen.SplashScreen
import kotlinx.coroutines.delay

enum class GlowGreen() {
    SplashScreen,
    Welcome,
    Discover,
    Connect,
    Signup,
}

@Composable
fun GlowGreenApp() {
    val navController: NavHostController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = GlowGreen.valueOf(
        backStackEntry?.destination?.route ?: GlowGreen.SplashScreen.name
    )

    NavHost(
        navController = navController,
        startDestination = GlowGreen.SplashScreen.name
    ) {
        composable(route = GlowGreen.SplashScreen.name) {
            SplashScreenComposed()
            LaunchedEffect(Unit) {
                delay(3000)
                navController.navigate(GlowGreen.Welcome.name)
            }
        }
        composable(
            route = GlowGreen.Welcome.name,
            enterTransition = { slideInHorizontally(initialOffsetX = { it }) },
            exitTransition = { slideOutHorizontally() },
            popEnterTransition = { slideInHorizontally() },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { it }) }
        ) {
            WelcomePageScreen(
                onButtonClick = {
                    navController.navigate(GlowGreen.Discover.name)
                }
            )
        }
        composable(
            route = GlowGreen.Discover.name,
            enterTransition = { slideInHorizontally(initialOffsetX = { it }) },
            exitTransition = { slideOutHorizontally() },
            popEnterTransition = { slideInHorizontally() },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { it }) }
        ) {
            DiscoverPlantScreen(
                onButtonClick = {
                    navController.navigate(GlowGreen.Connect.name)
                }
            )
        }
        composable(
            route = GlowGreen.Connect.name,
            enterTransition = { slideInHorizontally(initialOffsetX = { it }) },
            exitTransition = { slideOutHorizontally() },
            popEnterTransition = { slideInHorizontally() },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { it }) }
            ) {
            ConnectScreen(
                onButtonClick = {
                    navController.navigate(GlowGreen.Signup.name)
                }
            )
        }
        composable(
            route = GlowGreen.Signup.name,
            enterTransition = { slideInHorizontally(initialOffsetX = { it }) },
            exitTransition = { slideOutHorizontally() },
            popEnterTransition = { slideInHorizontally() },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { it })}
        ) {
            SignUpScreen()
        }

    }
}