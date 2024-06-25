package common_ui

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Directions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.ic_globe_asia
import org.jetbrains.compose.resources.painterResource


@Composable
fun locationItems(
    modifier: Modifier = Modifier,
    menuItem: MapItemData = commonMapItemsList.first()) {

    val uriHandler = LocalUriHandler.current

    Column {

        horizontalLine(modifier = modifier.padding(vertical = 14.dp))

        Row (verticalAlignment = Alignment.CenterVertically) {

            Column (modifier = modifier.weight(1f)) {

                Text(
                    text = menuItem.title,
                    color = Color(0XFFE8E8E8),
                    fontSize = 16.sp,
                    modifier =  modifier
                        .clickable {
                            menuItem.directionUrl?.let {
                                uriHandler.openUri(it)
                            }
                        }
                        .pointerHoverIcon(icon = PointerIcon.Hand)
                )

                Text(
                    text = menuItem.address,
                    color = Color(0XFFBDC1C6),
                    fontSize = 12.sp,
                    modifier = modifier.clickable {
                        menuItem.directionUrl?.let {
                            uriHandler.openUri(it)
                        }
                    }
                    .pointerHoverIcon(icon = PointerIcon.Hand)
                )

                if(menuItem.rating != 0) {

                    Row (verticalAlignment = Alignment.CenterVertically) {

                        Text(
                            text = menuItem.rating.toDouble().toString(),
                            color = Color(0XFFBDC1C6)
                        )

                        Spacer(modifier.padding(start = 2.dp))

                        ratingBar()

                        smallDot()

                        menuItem.type?.let {
                            Text(
                                text = it,
                                color = Color(0XFFBDC1C6),
                                fontSize = 12.sp
                            )
                        }
                    }
                }

                Text(
                    text = menuItem.hours,
                    color = Color(0XFFBDC1C6),
                    fontSize = 12.sp
                )
            }

            Row (modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){

                menuItem.websiteUrl?.let {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        //modifier = modifier.padding(horizontal = 8.dp)

                    ) {

                        IconButton({
                            uriHandler.openUri(it)
                        }, modifier = modifier
                            .border(
                                width = 1.dp,
                                shape = CircleShape,
                                color = Color(0XFFB1C5FF)
                            )
                            .size(38.dp)
                            .pointerHoverIcon(icon = PointerIcon.Hand)
                        ) {
                            Icon(
                                painter = painterResource(Res.drawable.ic_globe_asia),
                                contentDescription = null,
                                tint = Color(0XFFB1C5FF)
                            )
                        }

                        Spacer(modifier = modifier.padding(vertical = 1.dp))

                        Text(
                            text = "Website",
                            color = Color(0XFFB1C5FF)
                        )
                    }
                }

                Spacer(modifier.padding(horizontal = 8.dp))

                menuItem.directionUrl?.let {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        //modifier = modifier.padding(horizontal = 8.dp)
                    ) {

                        IconButton({
                            uriHandler.openUri(it)
                        }, modifier = modifier
                            .border(
                                width = 1.dp,
                                shape = CircleShape,
                                color = Color(0XFFB1C5FF)
                            )
                            .size(38.dp)
                            .pointerHoverIcon(icon = PointerIcon.Hand)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Directions,
                                contentDescription = null,
                                tint = Color(0XFFB1C5FF)
                            )
                        }

                        Spacer(modifier = modifier.padding(vertical = 1.dp))

                        Text(
                            text = "Direction",
                            color = Color(0XFFB1C5FF)
                        )
                    }
                }
            }
        }
    }
}