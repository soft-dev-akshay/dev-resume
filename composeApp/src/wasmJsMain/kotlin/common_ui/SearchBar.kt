package common_ui


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun googleSearchBar(
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier) {

    var inputSearch by remember { mutableStateOf("") }

    Row (
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .height(40.dp)
            .clip(CircleShape)
            .background(Color(0xFF303134))
    ) {

        BasicTextField(
            value = inputSearch,
            onValueChange = { inputSearch = it },
            modifier = modifier
                .padding(horizontal = 50.dp)
                .size(width = 800.dp, height = 40.dp),

            textStyle = TextStyle(
                color = Color.White,
                fontSize = 16.sp
            ),
            singleLine = true,
            keyboardActions = KeyboardActions(onDone = {})
        )


    }
//
//    Box(
//        modifier = Modifier
//            .padding(horizontal = 16.dp)
//            .height(textFieldHeight)
//            .clip(shape)
//            .background(Color(0xFF303134))
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier
//                .padding(horizontal = 8.dp)
//        ) {
//            BasicTextField(
//                value = inputSearch,
//                onValueChange = { inputSearch = it },
//                textStyle = TextStyle(
//                    color = Color.White,
//                    fontSize = 16.sp
//                ),
//                singleLine = true,
//                modifier = Modifier
//                    .weight(1f)
//                    .padding(vertical = 4.dp)
//            )
//
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.spacedBy(iconPadding),
//                modifier = Modifier
//                    .height(textFieldHeight)
//            ) {
//                if (inputSearch.isNotEmpty()) {
//                    Icon(
//                        imageVector = Icons.Default.Close,
//                        contentDescription = "Clear text",
//                        tint = Color.White,
//                        modifier = Modifier
//                            .size(iconSize)
//                            .clickable { inputSearch = "" }
//                    )
//                }
//
//                Icon(
//                    imageVector = Icons.Default.Mic,
//                    contentDescription = "Voice search",
//                    tint = Color.White,
//                    modifier = Modifier.size(iconSize)
//                )
//
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search",
//                    tint = Color.White,
//                    modifier = Modifier.size(iconSize)
//                )
//            }
//        }
//    }
}