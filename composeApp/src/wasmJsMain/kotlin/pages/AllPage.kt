package pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.map_image
import common_ui.*
import data.PageAllItemData
import data.pageAllMainData
import data.pageAllQuestionsList
import org.jetbrains.compose.resources.painterResource


@Composable
fun all(modifier: Modifier = Modifier) {

    val questionsList = remember { pageAllQuestionsList.toMutableStateList() }
    var currentId by remember { mutableIntStateOf(-1) }

    Row (modifier = modifier.fillMaxWidth()) {

        Column (modifier = modifier.weight(1f)) {

            //============================LATEST COMPANY, PROJECT, EDUCATION=================================
            LazyColumn(modifier = modifier.padding(top = 10.dp)) {

                items(pageAllMainData) {
                    latestCommon(it,modifier)
                }

                item {
                    Text(
                        text = "People also ask",
                        color = Color(0XFFE8E8E8),
                        fontSize = 22.sp,
                        modifier = modifier.padding(vertical = 12.dp)
                    )

                    horizontalLine(modifier.padding(vertical = 6.dp))
                }

                items(questionsList) { questions ->

                    questionsItem(
                        question = questions,
                        currentId,
                        onClickOpen = { id ->
                            currentId = if (currentId == id) -1 else id
                        }
                    )
                }

                item {
                    Text(
                        text = "Locations",
                        color = Color(0XFFE8E8E8),
                        fontSize = 22.sp,
                        modifier = modifier.padding(top = 14.dp)
                    )
                }

                item {
                    Image(painter = painterResource(Res.drawable.map_image),
                        contentDescription = "",
                        modifier = modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .padding(4.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop,
                    )

                    horizontalLine(modifier = modifier.padding(vertical = 6.dp))
                }

                items(commonMapItemsList) {
                    locationItems(mapItem = it)
                }
            }
        }

        verticalLine(modifier = modifier.padding(horizontal = 10.dp, vertical = 30.dp))

        Column (modifier = modifier.weight(1f)){
            sideInfo()
        }
    }
}

@Composable
fun latestCommon(
    pageAllItemData: PageAllItemData,
    modifier: Modifier = Modifier) {

    Column (modifier = modifier.padding(vertical = 16.dp)){
        Row (verticalAlignment = Alignment.CenterVertically){
            Image(
                painter = painterResource(pageAllItemData.image),
                contentDescription = "Avatar",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .clip(CircleShape)
                    .size(24.dp)
            )

            Column(modifier = modifier.padding(horizontal = 10.dp)) {
                Text(
                    text = pageAllItemData.heading,
                    fontSize = 14.sp,
                    color = Color(0XFFDADCE0)
                )
                Text(
                    text = pageAllItemData.url,
                    fontSize = 12.sp,
                    color = Color(0XFFDADCE0)
                )
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = pageAllItemData.title,
                color = Color(0XFF99C3FF),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(vertical = 4.dp)
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
            fontSize = 14.sp,
        )

        Row (verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = pageAllItemData.duration,
                color = Color.White,
                fontSize = 14.sp
            )

            smallDot()

            Text(
                text = if (pageAllItemData.isFullTime) "Full-Time" else "Part-Time",
                color = Color.White,
                fontSize = 14.sp
            )

            smallDot()

            Text(
                text = pageAllItemData.location,
                color = Color.White,
                fontSize = 14.sp,
                modifier = modifier.padding(vertical = 6.dp)
            )
        }
    }
}




