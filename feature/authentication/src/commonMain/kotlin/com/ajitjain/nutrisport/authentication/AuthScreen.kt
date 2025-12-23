package com.ajitjain.nutrisport.authentication

import ContentWithMessageBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ajitjain.nutrisport.Alpha
import com.ajitjain.nutrisport.Surface
import com.ajitjain.nutrisport.TextPrimary
import com.ajitjain.nutrisport.TextSecondary
import com.ajitjain.nutrisport.authentication.component.GoogleButton
import com.ajitjain.nutrisport.bebasNeueFont
import com.ajitjain.nutrisport.fontSize
import rememberMessageBarState

@Composable
fun AuthScreen() {
  val messageBarState = rememberMessageBarState()
  Scaffold { padding ->
    ContentWithMessageBar(
        contentBackgroundColor = Surface,
        modifier =
            Modifier.padding(
                top = padding.calculateTopPadding(),
                bottom = padding.calculateBottomPadding(),
            ),
        messageBarState = messageBarState,
        errorMaxLines = 2,
    ) {
      Column(modifier = Modifier.fillMaxSize()
          .padding(24.dp)
      ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
          Text(
              text = "NUTRISPORT",
              modifier = Modifier.fillMaxWidth(),
              textAlign = TextAlign.Center,
              fontFamily = bebasNeueFont(),
              fontSize = fontSize.EXTRA_LARGE,
              color = TextSecondary,
          )
          Text(
              text = "Sign in to continue",
              modifier = Modifier.fillMaxWidth().alpha(Alpha.HALF),
              textAlign = TextAlign.Center,
              fontSize = fontSize.EXTRA_REGULAR,
              color = TextPrimary,
          )
        }
        GoogleButton(loading = false, onClick = {})
      }
    }
  }
}
