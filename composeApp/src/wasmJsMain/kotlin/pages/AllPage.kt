package pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import common_ui.googleSearchBar
import common_ui.topMenu

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun allPage(modifier: Modifier = Modifier) {

    var inputSearch by remember { mutableStateOf("") }

    Column(modifier = modifier.fillMaxSize().background(color = Color(0XFF202124))) {

        Row (modifier = modifier.padding(top = 20.dp), verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = "Google",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = modifier.padding(start = 30.dp)
            )

            googleSearchBar({})


            topMenu(
                onClickedGmail = {},
                onClickedImages = {},
                onClickedAppIcon = {},
                onClickedProfile = {}
            )
        }
    }
}