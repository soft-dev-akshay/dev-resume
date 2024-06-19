package common_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.PageAllQuestion

@Composable
fun questionsItem(
    question: PageAllQuestion,
    onClickOpen: (Int) -> Unit,
    modifier: Modifier = Modifier) {

    Column (modifier = modifier.padding(end = 8.dp)){

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {

            Text(
                text = question.question,
                modifier = modifier.weight(1f),
                fontSize = 16.sp,
                color = Color.White
            )

            IconButton(
                onClick = { onClickOpen(question.id) },
                modifier = modifier
                    .background(
                        color = Color(0XFF313335),
                        shape = CircleShape)
                    .padding(2.dp)
                    .size(28.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Open",
                    modifier = modifier,
                    tint = Color.White
                )
            }
        }

        Spacer(modifier = modifier.padding(vertical = 4.dp))

        if (question.isOpen) {
            Text(
                text = question.answer,
                color = Color.White,
                fontSize = 12.sp
            )
        }

        horizontalLine(modifier = modifier.padding(vertical = 8.dp))
    }
}