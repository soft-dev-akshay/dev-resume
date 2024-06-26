package common_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun profileTooltip(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .background(
                color = Color(0XFF3C4043),
                shape = RoundedCornerShape(6.dp)
            )
            .padding(horizontal = 6.dp, vertical = 4.dp)
    ) {
        Text(
            text = "Google Account",
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = "Akshay Pawar",
            color = Color.White)
        Text(
            text = "pawarakshay13@gmail.com",
            color = Color.White)
    }
}