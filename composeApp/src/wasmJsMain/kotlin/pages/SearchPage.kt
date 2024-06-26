package pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Enter
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import common_ui.horizontalLine
import common_ui.profileTooltip
import common_ui.topMenu
import data.SearchMenu
import data.searchMenu
import utils.showSnack

@Composable
fun searchPage(
    onNavigate: () -> Unit,
    userInput: String,
    modifier: Modifier = Modifier,
    currentTabId: Int = 0) {

    var inputSearch by remember { mutableStateOf(userInput) }
    var currentId by remember { mutableIntStateOf(currentTabId) }
    var gmail by remember { mutableStateOf(false) }
    var profile by remember { mutableStateOf(false) }

    Box(modifier = modifier
        .fillMaxSize()
        .background(color = Color(0XFF202124))) {

        //================================HEADER===================================
        Row (modifier = modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = "Google",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = modifier
                    .padding(start = 40.dp)
                    .pointerHoverIcon(icon = PointerIcon.Hand)
                    .clickable {
                        onNavigate()
                    }
            )

            Row(modifier = modifier
                .padding(start = 50.dp)
                .background(color = Color(0XFF303134), shape = CircleShape)
                .width(650.dp),
                verticalAlignment = Alignment.CenterVertically) {

                BasicTextField(
                    value = inputSearch,
                    onValueChange = { inputSearch = it },
                    modifier = modifier
                        .padding(10.dp)
                        .padding(start = 10.dp)
                        .weight(1f)
                        .onKeyEvent {event ->
                            if (inputSearch.isNotEmpty()) {
                                if (event.key == Enter) {
                                    val search = inputSearch.lowercase()

                                    if (search.contains("experience")) {
                                        currentId = 1
                                    }
                                    else if(search.contains("project") || search.contains("work")) {
                                        currentId = 2
                                    }
                                    else if (search.contains("education") || search.contains("school") || search.contains("collage")) {
                                        currentId = 3
                                    }
                                    else if (search.contains("image") || search.contains("photo") || search.contains("pics")) {
                                        currentId = 4
                                    }
                                    else {
                                        currentId = 0
                                    }
                                }
                            }
                            true
                        },
                    textStyle = TextStyle(color = Color.White, fontSize = 14.sp),
                    singleLine = true,
                    cursorBrush = Brush.linearGradient(listOf(Color.White, Color.White))
                )


                Icon(
                    Icons.Default.Clear,
                    contentDescription = "Clear Search",
                    tint = Color.White,
                    modifier = modifier
                        .padding(horizontal = 6.dp)
                        .clickable {}
                )

                VerticalDivider(
                    thickness = 1.dp,
                    color = Color.White,
                    modifier = modifier
                        .padding(4.dp)
                        .height(30.dp))

                Icon(
                    imageVector = Icons.Default.Mic,
                    contentDescription = "Voice search",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 6.dp)
                        .size(24.dp)
                        .clickable {}
                )

                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(start = 6.dp, end = 16.dp)
                        .size(24.dp)
                        .clickable {
                            inputSearch = inputSearch
                            currentId = 0
                        }
                )
            }
        }

        //================================MENU=====================================
        Column {
            LazyRow(modifier = modifier.padding(top = 80.dp,start = 200.dp)) {
                items(searchMenu) {
                    menuItem(menu = it,
                        currentId = currentId,
                        onMenuClicked = {id ->
                            currentId = id
                        })
                }
            }

            horizontalLine(modifier = modifier)

            Column(
                modifier = modifier
                    .padding(start = if (currentId != 4) 200.dp else 0.dp)) {


                val search = inputSearch.lowercase()
                if (
                    !search.contains("akshay") &&
                    !search.contains("pawar") &&
                    !search.contains("portfolio") &&
                    !search.contains("experience") &&
                    !search.contains("project") &&
                    !search.contains("work") &&
                    !search.contains("education") &&
                    !search.contains("school") &&
                    !search.contains("collage") &&
                    !search.contains("image") &&
                    !search.contains("photo") &&
                    !search.contains("pics")) {


                    Row(modifier = modifier.padding(top = 20.dp)) {

                        Text(
                            text = "Did you mean: ",
                            color = Color(0xFFFF7769),

                            )
                        Text(
                            text = "Akshay Pawar",
                            color = Color(0XFF99C3FF),
                            fontStyle = FontStyle.Italic,
                            modifier = modifier
                                .pointerHoverIcon(icon = PointerIcon.Hand)
                                .clickable {
                                    inputSearch = "Akshay Pawar"
                                }
                        )
                    }
                }

                Row {

                    when(currentId) {
                        1 -> {
                            experience(modifier)
                        }
                        2 -> {
                            project(modifier)
                        }
                        3 -> {
                            education(modifier)
                        }
                        4 -> {
                            images(modifier)
                        }
                        else -> {
                            all(modifier = modifier)
                        }
                    }
                }
            }
        }

        Box(modifier = modifier.align(alignment = Alignment.TopEnd).padding(top = 10.dp, end = 10.dp)) {
            Column {

                topMenu(
                    onClickedGmail = { gmail = true },
                    onClickedImages = {
                        currentId = it
                    },
                    onClickedAppIcon = {},
                    onHoverProfile = {
                        profile = it
                    }
                )

                if (profile) {
                    profileTooltip()
                }
            }
        }



        //SHow Snack
        if (gmail) {
            Box(modifier = modifier
                .align(alignment = Alignment.BottomCenter)
                .padding( bottom = 35.dp)) {
                showSnack(onDismissed = { gmail = false }, message = "pawarakshay13@gmail.com")
            }
        }
    }
}


//Menu Below Search Bar
@Composable
fun menuItem (
    menu: SearchMenu,
    currentId: Int,
    onMenuClicked: (Int) -> Unit,
    modifier: Modifier = Modifier) {

    val textMeasurer = rememberTextMeasurer()
    var sizeInDp = with(LocalDensity.current) {
        textMeasurer.measure(menu.text).size.width.toDp()
    }

    Column (modifier = modifier .pointerHoverIcon(icon = PointerIcon.Hand)){

        Text(
            menu.text,
            modifier = modifier
                .padding(horizontal = 10.dp)
                .clickable { onMenuClicked(menu.id) },
            color = if(menu.id == currentId) Color(0XFF8AB4F8) else Color.White,
            fontSize = 12.sp
        )

        Spacer(modifier = modifier.padding(2.dp))

        if (menu.id == currentId) {
            sizeInDp = sizeInDp.plus(10.dp)

            HorizontalDivider(
                modifier = modifier
                    .width(sizeInDp)
                    .align(alignment = Alignment.CenterHorizontally),
                thickness = 2.dp,
                color = Color(0XFF8AB4F8)
            )
        }
    }
}