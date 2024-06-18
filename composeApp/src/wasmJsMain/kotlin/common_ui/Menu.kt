package common_ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.avatar
import org.jetbrains.compose.resources.painterResource


@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun topMenu(
    onClickedGmail: () -> Unit,
    onClickedImages: () -> Unit,
    onClickedAppIcon: () -> Unit,
    onClickedProfile: () -> Unit,
    modifier: Modifier = Modifier) {


    Row (verticalAlignment = Alignment.CenterVertically, modifier = modifier.padding(end = 10.dp)){
        Text(
            text = "Gmail",
            color = Color.White,
            modifier = modifier
                .padding(6.dp)
                .clickable { onClickedGmail() }
        )

        Text(
            text = "Images",
            color = Color.White,
            modifier = modifier.padding(6.dp).clickable { onClickedImages() }
        )

        IconButton(onClick = { onClickedAppIcon() }) {
            Icon(
                imageVector = Icons.Default.Apps,
                contentDescription = null,
                tint = Color.White
            )
        }

        Image(
            painter = painterResource(Res.drawable.avatar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .clip(CircleShape)
                .size(30.dp)
                .align(alignment = Alignment.CenterVertically)
                .onClick { onClickedProfile() }
        )
    }

}