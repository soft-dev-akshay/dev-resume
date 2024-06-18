package pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
fun homePage(modifier: Modifier = Modifier) {

    var gmail by remember { mutableStateOf(false) }
    var images by remember { mutableStateOf(false) }
    var appIcon by remember { mutableStateOf(false) }
    var profile by remember { mutableStateOf(false) }

    var inputSearch by remember { mutableStateOf("") }
    var searchButtonSnack by remember { mutableStateOf(false) }
    var viewResumeSnack by remember { mutableStateOf(false) }

    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            SnackbarHost(snackbarHostState, modifier = modifier)
        }) {

        Column (modifier = modifier
            .padding(it)
            .fillMaxSize()
            .background(color = Color(0XFF202124))) {

            Box(modifier= modifier.align(alignment = Alignment.End)) {
                topMenu(
                    onClickedGmail = { gmail = true },
                    onClickedImages = { images = true },
                    onClickedAppIcon = { appIcon = true },
                    onClickedProfile = { profile = true },
                    modifier = modifier
                )
            }

            Text (
                text = "Google",
                fontSize = 100.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 100.dp, bottom = 30.dp)
            )

            OutlinedTextField (
                value = inputSearch,
                placeholder = { Text("Search for me") },
                onValueChange = { s -> inputSearch = s },
                modifier = modifier.align(alignment = Alignment.CenterHorizontally)
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

                    }
                ),
                singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0XFFDFE1E5)
                )
            )

            Row (modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(top = 20.dp)
            ) {
                OutlinedButton(
                    onClick = { searchButtonSnack = true },
                    shape = RoundedCornerShape(6.dp),
                    border = BorderStroke(1.dp, color = Color(0XFFDFE1E5)),
                    modifier = modifier.padding(end = 6.dp)
                ) {
                    Text(text = "Search Me", color = Color(0XFFDFE1E5))
                }

                OutlinedButton(
                    onClick = { viewResumeSnack = true },
                    shape = RoundedCornerShape(6.dp),
                    border = BorderStroke(1.dp, color = Color.White),
                    modifier = modifier.padding(start = 8.dp)
                ) {
                    Text(text = "View Resume", color = Color.White)
                }
            }

            Row (modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(top = 20.dp)
            ) {
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

            Spacer(modifier = modifier.weight(1f))

            Row (
                modifier = modifier
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

//            if (searchButtonSnack) showSnack(message = "Search Button Clicked", onDismissed = { searchButtonSnack = false })
//            if (viewResumeSnack) showSnack("View Resume Clicked", onDismissed = { viewResumeSnack = false })


        }
    }
}