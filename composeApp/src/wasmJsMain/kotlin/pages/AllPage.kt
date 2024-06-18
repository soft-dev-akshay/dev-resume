package pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import common_ui.googleSearchBar
import common_ui.topMenu
import data.SearchMenu
import data.searchMenu

enum class CurrentView {
    ALL, EXPERIENCE, PROJECTS, EDUCATION, IMAGES
}
@Composable
fun allPage(modifier: Modifier = Modifier) {

    var inputSearch by remember { mutableStateOf("") }
    var currentPageId by remember { mutableIntStateOf(0) }

    Column(modifier = modifier.fillMaxSize().background(color = Color(0XFF202124))) {

        Row (modifier = modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = "Google",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = modifier.padding(start = 30.dp)
            )

            Spacer(modifier = modifier.padding(start = 60.dp))

            googleSearchBar(
                onClickClose = {
                    inputSearch = ""
                },
                onClickMic = {},
                onClickSearch = {},
                onSearch = {
                    inputSearch = it
                }
            )

            Spacer(modifier = modifier.weight(1f))

            topMenu(
                onClickedGmail = {},
                onClickedImages = {},
                onClickedAppIcon = {},
                onClickedProfile = {}
            )
        }


        playground()

//        searchMenu.forEach {
//
//            menuItem (
//                searchMenu = it,
//                color = if (it.id == currentPageId) Color.White else Color(0XFF9AA0A6),
//                currentIndex = 0,
//                onSelectMenuItem = {}
//            )
//        }
    }
}


@Composable
fun menuItem(
    searchMenu: SearchMenu,
    color: Color,
    currentIndex: Int,
    onSelectMenuItem:(Int) -> Unit,
    modifier: Modifier = Modifier
) {

    Tab(selected = searchMenu.id == currentIndex,
        onClick = { onSelectMenuItem(searchMenu.id) },
        modifier = modifier,
        text = {
            Text(text = searchMenu.text, color = color)
        }
    )
}








@Composable
fun playground(modifier: Modifier = Modifier) {

    var currentPageId by remember { mutableIntStateOf(2) }

    /**
    Row {

    searchMenu.forEach {

    menuItem(
    searchMenu = it,
    color = if (it.id == currentPageId) Color.White else Color(0XFF9AA0A6),
    it.id, {id ->
    currentPageId = id
    },
    modifier = modifier
    )
    }
    }
     **/


    Scaffold(modifier = modifier.wrapContentWidth()) { pv ->
        Column(
            modifier = Modifier.padding(pv),
            horizontalAlignment = Alignment.Start
        ) {

            TabRow(
                selectedTabIndex = currentPageId,
                modifier = Modifier.wrapContentWidth()
            ) {

                searchMenu.forEach {
                    Tab(
                        selected = it.id == currentPageId,
                        onClick = { currentPageId = it.id },
                        modifier = modifier.wrapContentWidth()
                            .background(color = Color(0XFF202124)),

                        ) {
                        Text(
                            text = it.text,
                            color = if (it.id == currentPageId) Color.White else Color(0XFF9AA0A6)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

        }
    }
}