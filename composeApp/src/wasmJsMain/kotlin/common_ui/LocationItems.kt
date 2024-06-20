package common_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.ic_globe_asia
import org.jetbrains.compose.resources.painterResource


@Composable
fun locationItems(mapItem: MapItemData, modifier: Modifier = Modifier) {

    val uriHandler = LocalUriHandler.current

    Column {

        Row (
            modifier = modifier.padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically){

            Column (modifier = modifier.weight(1f, fill = true)) {
                Text(
                    text = mapItem.title,
                    color = Color.White,
                    fontSize = 16.sp
                )

                Text(
                    text = mapItem.address,
                    color = Color(0xFFBDC1C6),
                    fontSize = 12.sp
                )

                Row (verticalAlignment = Alignment.CenterVertically) {
                    if (mapItem.rating != 0) {
                        Text(
                            text = mapItem.rating.toString(),
                            color = Color(0xFFBDC1C6),
                            fontSize = 12.sp
                        )
                        ratingBar()

                        smallDot()

                        mapItem.type?.let {
                            Text(
                                text = it,
                                color = Color(0xFFBDC1C6),
                                fontSize = 12.sp
                            )
                        }

                    }
                }

                Text(
                    text = mapItem.hours,
                    color = Color(0xFFBDC1C6),
                    fontSize = 12.sp
                )
            }

            mapItem.websiteUrl?.let {
                Column (modifier = modifier
                    .padding(horizontal = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {


                    IconButton(onClick = {
                        uriHandler.openUri(it)
                    }, modifier = modifier
                        .background(
                            color = Color.Transparent,
                            shape = CircleShape
                        )
                        .border(
                            width = 1.5.dp,
                            color = Color(0XFFB1C5FF),
                            shape = CircleShape
                        )) {
                        Icon(
                            painter = painterResource(Res.drawable.ic_globe_asia),
                            contentDescription = null,
                            tint = Color(0XFFB1C5FF),
                        )
                    }

                    Text(
                        text = "Website",
                        fontSize = 12.sp,
                        color = Color(0XFFBDC1C6),
                        modifier = modifier.padding(top = 4.dp)
                    )
                }
            }

            mapItem.directionUrl?.let {
                Column(
                    modifier = modifier
                        .padding(horizontal = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = {
                        uriHandler.openUri(it)
                    }, modifier = modifier
                        .background(
                            color = Color.Transparent,
                            shape = CircleShape
                        )
                        .border(
                            width = 1.5.dp,
                            color = Color(0XFFB1C5FF),
                            shape = CircleShape
                        )) {
                        Icon(
                            painter = painterResource(Res.drawable.ic_globe_asia),
                            contentDescription = null,
                            tint = Color(0XFFB1C5FF),
                        )
                    }

                    Text(
                        text = "Directions",
                        fontSize = 12.sp,
                        color = Color(0XFFBDC1C6),
                        modifier = modifier.padding(top = 4.dp)
                    )
                }
            }
        }
    }

}