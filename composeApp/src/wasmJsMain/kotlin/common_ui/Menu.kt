package common_ui

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
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
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.avatar
import org.jetbrains.compose.resources.painterResource
import pages.homePage


@Composable
fun topMenu(
    onClickedGmail: () -> Unit,
    onClickedImages: (Int) -> Unit,
    onClickedAppIcon: () -> Unit,
    onHoverProfile: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    interactionSrc: MutableInteractionSource = remember { MutableInteractionSource() }) {

    Row (verticalAlignment = Alignment.CenterVertically, modifier = modifier.padding(end = 10.dp)){
        Text(
            text = "Gmail",
            color = Color.White,
            modifier = modifier
                .padding(6.dp)
                .clickable { onClickedGmail() }
                .pointerHoverIcon(icon = PointerIcon.Hand)
        )

        Text(
            text = "Images",
            color = Color.White,
            modifier = modifier
                .padding(6.dp)
                .clickable { onClickedImages(4) }
                .pointerHoverIcon(icon = PointerIcon.Hand)
        )

        IconButton(
            onClick = { onClickedAppIcon() },
            modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand)) {
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
                .hoverable(interactionSrc,enabled = true)
                .pointerHoverIcon(icon = PointerIcon.Hand)
        )

        onHoverProfile(interactionSrc.collectIsHoveredAsState().value)
    }
}