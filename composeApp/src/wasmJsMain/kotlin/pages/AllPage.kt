package pages

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.avatar
import common_ui.smallDot
import common_ui.topMenu
import data.PageAllItemData
import data.SearchMenu
import data.pageAllMainData
import data.searchMenu
import org.jetbrains.compose.resources.painterResource


//@Composable
//fun allPage(modifier: Modifier = Modifier) {
//
//    var inputSearch by remember { mutableStateOf("Akshay Pawar") }
//    var currentId by remember { mutableIntStateOf(0) }
//
//    Column(modifier = modifier
//        .fillMaxSize()
//        .background(color = Color(0XFF202124))) {
//
//        Row (modifier = modifier.padding(top = 20.dp),
//            verticalAlignment = Alignment.CenterVertically) {
//
//            Text(
//                text = "Google",
//                fontSize = 30.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color.White,
//                modifier = modifier.padding(start = 50.dp)
//            )
//
//            Row(modifier = modifier
//                .padding(start = 60.dp)
//                .background(color = Color(0XFF303134), shape = CircleShape)
//                .padding(6.dp)
//                .width(650.dp),
//                verticalAlignment = Alignment.CenterVertically
//
//            ) {
//
//                BasicTextField(
//                    value = inputSearch,
//                    onValueChange = { inputSearch = it },
//                    modifier = modifier
//                        .padding(16.dp)
//                        .padding(start = 10.dp)
//                        .weight(1f),
//                    textStyle = TextStyle(color = Color.White, fontSize = 16.sp)
//                )
//
//
//                Icon(
//                    Icons.Default.Clear,
//                    contentDescription = "Clear Search",
//                    tint = Color.White,
//                    modifier = modifier
//                        .padding(horizontal = 6.dp)
//                        .clickable {}
//                )
//
//                VerticalDivider(
//                    thickness = 1.dp,
//                    color = Color.White,
//                    modifier = modifier
//                        .padding(4.dp)
//                        .height(30.dp))
//
//                Icon(
//                    imageVector = Icons.Default.Mic,
//                    contentDescription = "Voice search",
//                    tint = Color.White,
//                    modifier = Modifier
//                        .padding(horizontal = 6.dp)
//                        .size(24.dp)
//                        .clickable {}
//                )
//
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search",
//                    tint = Color.White,
//                    modifier = Modifier
//                        .padding(start = 6.dp, end = 16.dp)
//                        .size(24.dp)
//                        .clickable {}
//                )
//            }
//
//            Spacer(modifier = modifier.weight(1f))
//
//            topMenu(
//                onClickedGmail = {},
//                onClickedImages = {},
//                onClickedAppIcon = {},
//                onClickedProfile = {}
//            )
//
//        }
//
//        Spacer(modifier = modifier.padding(vertical = 16.dp))
//
//        LazyRow(modifier = modifier.padding(start = 220.dp)) {
//            items(searchMenu) {
//                menuItem(it,currentId, { id ->
//                    currentId = id
//                }, modifier)
//            }
//        }
//
//        HorizontalDivider(modifier = modifier, color = Color(0XFF313335))
//
//        Row (modifier = modifier) {
//
//            // Create new File and Show All List, Experience,
//        }
//    }
//}

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

    Column {

        Text(
            menu.text,
            modifier = modifier
                .padding(horizontal = 10.dp)
                .clickable { onMenuClicked(menu.id) },
            color = Color.White,
            fontSize = 12.sp
        )

        Spacer(modifier = modifier.padding(2.dp))

        if (menu.id == currentId) {
            sizeInDp = sizeInDp.plus(10.dp)

            HorizontalDivider(
                modifier = modifier.width(sizeInDp).align(alignment = Alignment.CenterHorizontally),
                thickness = 2.dp,
                color = Color.White
            )
        }

    }
}



//=====================================================================

enum class CurrentView {
    ALL, EXPERIENCE, PROJECTS, EDUCATION, IMAGES
}
@Composable
fun allPage(modifier: Modifier = Modifier) {

    var inputSearch by remember { mutableStateOf("Akshay Pawar") }
    var currentId by remember { mutableIntStateOf(0) }

    Column(modifier = modifier
        .fillMaxSize()
        .background(color = Color(0XFF202124))) {

        Row (modifier = modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = "Google",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = modifier.padding(start = 50.dp)
            )

            Row(modifier = modifier
                .padding(start = 60.dp)
                .background(color = Color(0XFF303134), shape = CircleShape)
                .padding(6.dp)
                .width(650.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {

                BasicTextField(
                    value = inputSearch,
                    onValueChange = { inputSearch = it },
                    modifier = modifier
                        .padding(16.dp)
                        .padding(start = 10.dp)
                        .weight(1f),
                    textStyle = TextStyle(color = Color.White, fontSize = 16.sp)
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
                        .clickable {}
                )
            }

            Spacer(modifier = modifier.weight(1f))

            topMenu(
                onClickedGmail = {},
                onClickedImages = {},
                onClickedAppIcon = {},
                onClickedProfile = {}
            )

        }

        Spacer(modifier = modifier.padding(vertical = 16.dp))

        LazyRow(modifier = modifier.padding(start = 220.dp)) {
            items(searchMenu) {
                MenuItem(it,currentId, { id ->
                    currentId = id
                }, modifier)
            }
        }

        HorizontalDivider(modifier = modifier, color = Color(0XFF313335))

        Row (modifier = modifier.padding(start = 230.dp)) {

            when(currentId) {
                1 -> {}
                2 -> {}
                3 -> {}
                4 -> {}
                else -> {
                    MenuAll(modifier)
                }
            }
            // Create new File and Show All List, Experience,
        }

    }
}

//Menu Below Search Bar
@Composable
fun MenuItem (
    menu: SearchMenu,
    currentId: Int,
    onMenuClicked: (Int) -> Unit,
    modifier: Modifier = Modifier) {

    val textMeasurer = rememberTextMeasurer()
    var sizeInDp = with(LocalDensity.current) {
        textMeasurer.measure(menu.text).size.width.toDp()
    }

    Column {

        Text(
            menu.text,
            modifier = modifier
                .padding(horizontal = 10.dp)
                .clickable { onMenuClicked(menu.id) },
            color = Color.White,
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
                color = Color.White
            )
        }
    }
}


@Composable
fun MenuAll(modifier: Modifier = Modifier) {

    Column {
        LazyColumn(modifier = modifier.padding(top = 10.dp)) {
            items(pageAllMainData) {
                PageAllItems(it,modifier)
            }
        }

        pageAllQuestions(modifier)
    }
}

@Composable
fun pageAllQuestions(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "People also ask",
            color = Color(0XFFE8E8E8),
            fontSize = 16.sp,
            modifier = modifier.padding(top = 20.dp)
        )

        LazyColumn {
            //Design Questionair Screen and Update data
        }
    }
}

@Composable
fun PageAllItems(
    pageAllItemData: PageAllItemData,
    modifier: Modifier = Modifier) {

    Column (modifier = modifier.padding(vertical = 16.dp)){
        Row (verticalAlignment = Alignment.CenterVertically){
            Image(
                painter = painterResource(Res.drawable.avatar),
                contentDescription = "Avatar",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .clip(CircleShape)
                    .size(24.dp)
            )

            Column(modifier = modifier.padding(horizontal = 10.dp)) {
                Text(
                    text = pageAllItemData.heading,
                    fontSize = 10.sp,
                    color = Color(0XFFDADCE0)
                )
                Text(
                    text = pageAllItemData.url,
                    fontSize = 8.sp,
                    color = Color(0XFFDADCE0)
                )
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = pageAllItemData.title,
                color = Color(0XFF99C3FF),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                Icons.Default.CheckCircle,
                contentDescription = "Verified",
                tint = Color(0XFF3DA288),
                modifier = modifier
                    .padding(horizontal = 4.dp)
                    .size(16.dp)
            )
        }

        Text(
            text = pageAllItemData.desc,
            color = Color(0XFFBDC1C6),
            fontSize = 12.sp
        )

        Row (verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = pageAllItemData.duration,
                color = Color.White,
                fontSize = 12.sp
            )

            smallDot()

            Text(
                text = if (pageAllItemData.isFullTime) "Full-Time" else "Part-Time",
                color = Color.White,
                fontSize = 12.sp
            )

            smallDot()

            Text(
                text = pageAllItemData.location,
                color = Color.White,
                fontSize = 12.sp
            )
        }
    }
}
