package common_ui


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.onClick
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun googleSearchBar(
    onClickClose: () -> Unit,
    onClickMic: () -> Unit,
    onClickSearch: () -> Unit,
    onSearch: (String) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(50.dp),

) {
    var searchText by remember { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current

    Box(
        modifier = modifier.background(color = Color(0xFF303134), shape),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.width(700.dp)
        ) {
            Spacer(modifier = Modifier.width(16.dp))

            TextField(
                value = searchText,
                onValueChange = {
                    searchText = it
                },
                textStyle = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent, cursorColor = Color.White
                ),
                shape = shape,
                singleLine = true,
                modifier = Modifier.weight(1f),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Search
                ),
                keyboardActions = KeyboardActions(
                    onSearch = {
                        if (searchText.isNotBlank()) {
                            onSearch(searchText)
                            keyboardController?.hide()
                        }
                    }
                )
            )

            Icon(
                Icons.Default.Clear,
                contentDescription = "Clear Search",
                tint = Color.White,
                modifier = modifier
                    .padding(horizontal = 6.dp).onClick {
                        onClickClose()
                    }
            )

            VerticalDivider(thickness = 1.dp, color = Color.White, modifier = modifier.padding(4.dp).height(30.dp))

            Icon(
                imageVector = Icons.Default.Mic,
                contentDescription = "Voice search",
                tint = Color.White,
                modifier = Modifier
                    .padding(horizontal = 6.dp)
                    .size(24.dp)
                    .onClick {
                        onClickMic()
                    }
            )

            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                tint = Color.White,
                modifier = Modifier
                    .padding(start = 6.dp, end = 16.dp)
                    .size(24.dp)
                    .onClick {
                        onClickSearch()
                    }
            )
        }
    }
}
