package utils

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material3.Snackbar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Deprecated("not using anywhere")
@Composable
fun showSnack(
    message: String? = null,
    onDismissed:(Boolean) -> Unit,
    modifier: Modifier = Modifier) {

    Snackbar (
        action = {},
        modifier = modifier.padding(6.dp).animateContentSize(
            animationSpec = tween(
                durationMillis = 1000,
                delayMillis = 10,
                easing = FastOutSlowInEasing
            )
        ),
        dismissAction = {},
        actionOnNewLine = true,
        shape = RoundedCornerShape(10.dp),
        containerColor = Color.White,
        contentColor = Color.Black,
    ) {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                //.align(alignment = Alignment.CenterHorizontally)
        ) {

            Text(
                text = message ?: "Nothing",
                modifier = modifier.weight(1f),
                color = Color.Black
            )

            TextButton(
                onClick = {
                    onDismissed(false)
                }
            ) {
                Text(text = "Close")
            }
        }
    }
}