package com.metehanbolat.jetpackcomposerelearnagain

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.metehanbolat.jetpackcomposerelearnagain.ui.theme.JetpackComposeRelearnAgainTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeRelearnAgainTheme {
                PageNavigation()
            }
        }
    }
}

@Composable
fun PageNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Main Page"){
        composable("Main Page"){
            MainPage(navController = navController)
        }
        composable("First Page"){
            FirstPage(navController = navController)
        }
        composable("Second Page"){
            SecondPage()
        }
    }
}

@Composable
fun MainPage(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Main Page",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Button(
                onClick = {
                    navController.navigate("First Page")
                }
            ) {
                Text(text = "Go To First Page")
            }
        }
    }
}