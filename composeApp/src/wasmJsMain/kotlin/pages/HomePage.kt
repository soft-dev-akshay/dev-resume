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
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.*
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import common_ui.profileTooltip
import common_ui.topMenu
import utils.showSnack

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun homePage(
    onNavigate: (Int, String) -> Unit,
    onViewResume: () -> Unit,
    modifier: Modifier = Modifier) {

    var gmail by remember { mutableStateOf(false) }
    var profile by remember { mutableStateOf(false) }



    var hoverOnSearchButton by remember { mutableStateOf(false) }
    var hoverOnResumeButton by remember { mutableStateOf(false) }

    var inputSearch by remember { mutableStateOf("") }

    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            SnackbarHost(snackbarHostState, modifier = modifier)
        }) {

        Box (modifier = modifier
            .padding(it)
            .fillMaxSize()
            .background(color = Color(0XFF202124))) {

            Box(
                modifier= modifier.align(alignment = Alignment.TopEnd),
                contentAlignment = Alignment.TopEnd) {

                Column (modifier = modifier.padding(top = 10.dp, end = 10.dp)){

                    topMenu(
                        onClickedGmail = { gmail = true },
                        onClickedImages = { id ->
                            onNavigate(id,inputSearch)
                        },
                        onClickedAppIcon = {},
                        onHoverProfile = { doShow -> profile = doShow },
                        modifier = modifier
                    )

                    if (profile) {

                        Column (modifier = modifier) {
                            profileTooltip()
                        }
                    }
                }
            }

            //===================================================================================================CENTRAL
            Column (
                modifier = modifier
                    .align(alignment = Alignment.Center)
                    .padding(bottom = 100.dp)) {
                Text (
                    text = "Google",
                    fontSize = 100.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(30.dp)
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
                            onNavigate(0,inputSearch)
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
                    Button(
                        onClick = { onNavigate(0,inputSearch) },
                        shape = RoundedCornerShape(6.dp),
                        border = BorderStroke(width = 0.5.dp,
                            color = if(hoverOnSearchButton) Color.White else Color(0XFF303134)
                        ),
                        modifier = modifier
                            .padding(end = 6.dp)
                            .pointerHoverIcon(icon = PointerIcon.Hand)
                            .onPointerEvent(
                                eventType = PointerEventType.Enter,
                                pass = PointerEventPass.Main) {
                                hoverOnSearchButton = true

                            }.onPointerEvent(
                                eventType = PointerEventType.Exit,
                                pass = PointerEventPass.Main) {
                                hoverOnSearchButton = false
                            },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF303134), disabledContainerColor = Color(0XFF303134)),
                        enabled = inputSearch.isNotEmpty(),
                    ) {
                        Text(text = "Search Me", color = Color(0XFFDFE1E5))
                    }

                    Button(
                        onClick = { onViewResume() },
                        shape = RoundedCornerShape(6.dp),
                        border = BorderStroke(
                            width = 0.5.dp,
                            color = if(hoverOnResumeButton) Color.White else Color(0XFF303134)
                        ),
                        modifier = modifier.padding(start = 8.dp)
                            .pointerHoverIcon(icon = PointerIcon.Hand)
                            .onPointerEvent(
                                eventType = PointerEventType.Enter,
                                pass = PointerEventPass.Main) {
                                hoverOnResumeButton = true
                            }.onPointerEvent(
                                eventType = PointerEventType.Exit,
                                pass = PointerEventPass.Main) {
                                hoverOnResumeButton = false
                            },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF303134))
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

            //===================================================================================================FOOTER
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


            //SHow Snack
            if (gmail) {
                Box(modifier = modifier
                    .align(alignment = Alignment.BottomCenter)
                    .padding( bottom = 35.dp)
                ) {
                    showSnack(onDismissed = {gmail = false}, message = "pawarakshay13@gmail.com")
                }
            }
        }
    }
}