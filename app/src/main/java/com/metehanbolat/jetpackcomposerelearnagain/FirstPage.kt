package com.metehanbolat.jetpackcomposerelearnagain

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FirstPage(navController: NavController) {
    /** State Structure */
    /** It is used for the variables to be changed in the interface. **/
    val counter = remember { mutableStateOf(0) }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "First Page",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
            )
            Button(
                onClick = {
                    navController.navigate("Second Page")
                }
            ) {
                Text(text = "Go To Second Page")
            }

            Text(
                text = counter.value.toString(),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Button(
                modifier = Modifier.padding(top = 20.dp),
                onClick = {
                    counter.value = counter.value + 1
                }
            ) {
                Text(text = "Button")
            }
        }
    }
}