package pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import common_ui.topMenu

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun homePage(
    onNavigate: () -> Unit,
    onViewResume: () -> Unit,
    modifier: Modifier = Modifier) {

    var gmail by remember { mutableStateOf(false) }
    var images by remember { mutableStateOf(false) }
    var appIcon by remember { mutableStateOf(false) }
    var profile by remember { mutableStateOf(false) }

    var inputSearch by remember { mutableStateOf("") }
    var viewResumeSnack by remember { mutableStateOf(false) }

    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            SnackbarHost(snackbarHostState, modifier = modifier)
        }
    ) {

        Box (modifier = modifier
            .padding(it)
            .fillMaxSize()
            .background(color = Color(0XFF202124))) {

            Box(
                modifier= modifier.align(alignment = Alignment.TopEnd),
                contentAlignment = Alignment.TopEnd) {
                Column {
                    topMenu(
                        onClickedGmail = { },
                        onClickedImages = { images = true },
                        onClickedAppIcon = { appIcon = true },
                        onHoverProfile = {},
                        modifier = modifier
                    )

                    if (!profile) {
                        Column (modifier = modifier.padding(end = 10.dp)) {
                            Column(
                                modifier = modifier
                                    .background(
                                        color = Color.White,
                                        shape = RoundedCornerShape(6.dp)
                                    )
                                    .padding(horizontal = 6.dp, vertical = 4.dp)
                            ){
                                Text(text = "Google Account")
                                Text(text = "Akshay Pawar")
                                Text(text = "pawarakshay13@gmail.com")
                            }
                        }
                    }
                }
            }

            Column (
                modifier = modifier.align(alignment = Alignment.Center),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text (
                    text = "Google",
                    fontSize = 100.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = modifier
                        .align(alignment = Alignment.CenterHorizontally)
                )

                OutlinedTextField (
                    value = inputSearch,
                    placeholder = { Text("Search for me") },
                    onValueChange = { s -> inputSearch = s },
                    modifier = modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .width(800.dp)
                        .padding(start = 60.dp, end = 60.dp),
                    shape = RoundedCornerShape(30.dp),
                    textStyle = TextStyle(
                        color = Color.White,
                        fontSize = 16.sp,
                    ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = modifier.padding(start = 16.dp)
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Mic,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = modifier.padding(end = 16.dp)
                        )
                    },
                    keyboardActions = KeyboardActions(
                        onDone = {
                            onNavigate()
                        }
                    ),
                    singleLine = true,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0XFFDFE1E5)
                    ),
                )

                Row (modifier = modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 20.dp)) {
                    OutlinedButton(
                        onClick = { onNavigate() },
                        shape = RoundedCornerShape(6.dp),
                        border = BorderStroke(width = 1.dp,
                            color = Color(0XFFDFE1E5)
                        ),
                        modifier = modifier
                            .padding(end = 6.dp)
                            .pointerHoverIcon(icon = PointerIcon.Hand),
                        enabled = inputSearch.isNotEmpty()
                    ) {
                        Text(text = "Search Me", color = Color(0XFFDFE1E5))
                    }

                    OutlinedButton(
                        onClick = { onViewResume() },
                        shape = RoundedCornerShape(6.dp),
                        border = BorderStroke(1.dp, color = Color.White),
                        modifier = modifier.padding(start = 8.dp)
                            .pointerHoverIcon(icon = PointerIcon.Hand)
                    ) {
                        Text(text = "View Resume", color = Color.White)
                    }
                }

                Row (modifier = modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 20.dp)) {
                    val str = buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.White)) {
                            append("Google offered in:")
                        }
                        append("  ")

                        withStyle(
                            style = SpanStyle(
                                color = Color(0XFF99C3FF),
                                fontSize = 16.sp)){
                            append("Marathi")
                        }
                        append("   ")

                        withStyle(
                            style = SpanStyle(
                                color = Color(0XFF99C3FF),
                                fontSize = 16.sp)){
                            append("Hindi")
                        }

                        append("   ")

                        withStyle(
                            style = SpanStyle(
                                color = Color(0XFF99C3FF),
                                fontSize = 16.sp)){
                            append("English")
                        }
                    }
                    Text(text = str)
                }
            }

            Row (
                modifier = modifier
                    .align(alignment = Alignment.BottomCenter)
                    .background(color = Color(0xFF313335))
                    .padding(10.dp),
            ) {

                Text (
                    text = "India, MH15--",
                    color = Color.White,
                    modifier = modifier.weight(1f)
                )

                Text (
                    text = "Version 1.Alpha",
                    color = Color.White,
                    modifier = modifier.weight(1f),
                    textAlign = TextAlign.Center,
                )

                Text (
                    text = "Privacy",
                    color = Color.White,
                    modifier = modifier.weight(1f),
                    textAlign = TextAlign.End
                )
            }
        }
    }
}