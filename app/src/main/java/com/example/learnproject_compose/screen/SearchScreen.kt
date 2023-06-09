package com.example.learnproject_compose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.learnproject_compose.screen.home.largeRadialGradient

@Composable
fun SearchPage(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(largeRadialGradient),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Search Screen", fontSize = 60.sp)

    }
}