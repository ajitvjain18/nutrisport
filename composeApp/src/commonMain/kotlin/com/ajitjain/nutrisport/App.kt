package com.ajitjain.nutrisport

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.mmk.kmpauth.google.GoogleAuthCredentials
import com.mmk.kmpauth.google.GoogleAuthProvider

@Composable
fun App() {
  MaterialTheme {
    var appReady by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
      GoogleAuthProvider.create(
          credentials =
              GoogleAuthCredentials(
                  serverId =
                      "829439694216-geb1t37ms6h92e1hel9g2m2a33nq3tb9.apps.googleusercontent.com"
              )
      )
      appReady = true
    }

    AnimatedVisibility(modifier = Modifier.fillMaxSize(), visible = appReady) { SetUpNavGraph() }
  }
}
