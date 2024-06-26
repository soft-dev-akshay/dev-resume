package common_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.avatar
import data.ExperienceData
import org.jetbrains.compose.resources.painterResource


@Composable
fun experienceItems(experienceData: ExperienceData, modifier: Modifier = Modifier) {

    Column (modifier = modifier.padding(vertical = 16.dp)) {
        Row (verticalAlignment = Alignment.CenterVertically){
            Image(
                painter = painterResource(experienceData.image),
                contentDescription = "Avatar",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .clip(CircleShape)
                    .size(24.dp)
            )

            Column(modifier = modifier.padding(horizontal = 10.dp)) {
                Text(
                    text = experienceData.titlePosition,
                    fontSize = 14.sp,
                    color = Color(0XFFDADCE0)
                )
                Text(
                    text = experienceData.websiteLink,
                    fontSize = 12.sp,
                    color = Color(0XFFDADCE0)
                )
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = experienceData.companyName,
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

        Row (verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = experienceData.duration,
                color = Color.White,
                fontSize = 14.sp
            )

            smallDot()

            Text(
                text = experienceData.workMode,
                color = Color.White,
                fontSize = 14.sp
            )

            smallDot()

            //Work Location
            Text(
                text = experienceData.workLocation,
                color = Color.White,
                fontSize = 14.sp,
                modifier = modifier.padding(vertical = 6.dp)
            )

            smallDot()

            //Work Type
            Text(
                text = experienceData.workType,
                color = Color.White,
                fontSize = 14.sp,
                modifier = modifier.padding(vertical = 6.dp)
            )
        }

        Column {
            experienceData.bulletPoints.forEach {
                Row (verticalAlignment = Alignment.Top,
                    modifier = modifier.padding(vertical = 2.dp)) {
                    smallDot(modifier = modifier.padding(top = 6.dp, end = 6.dp))
                    Text(
                        text = it,
                        color = Color(0XFFBDC1C6)
                    )
                }
            }
        }
        // LazyColumn (userScrollEnabled = false) { items(experienceData.bulletPoints) {} }
    }
}