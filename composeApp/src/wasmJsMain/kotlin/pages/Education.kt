package pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.map_education
import aoogle.composeapp.generated.resources.map_image
import common_ui.*
import data.*
import org.jetbrains.compose.resources.painterResource

@Composable
fun education(modifier: Modifier) {

    var currentId by remember { mutableIntStateOf(-1) }

    Row (modifier = modifier.fillMaxWidth()) {

        Column (modifier = modifier.weight(1f)) {

            //============================LATEST COMPANY, PROJECT, EDUCATION=================================
            LazyColumn(modifier = modifier.padding(top = 10.dp)) {

                items(educationData) {
                    latestCommon(it,modifier)
                }

                item {
                    Text(
                        text = "People also ask",
                        color = Color(0XFFE8E8E8),
                        fontSize = 20.sp,
                        modifier = modifier.padding(top = 12.dp)
                    )

                    horizontalLine(modifier.padding(top = 6.dp))
                }

                items(educationQuestion) { questions ->

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
                        text = "Places",
                        color = Color(0XFFE8E8E8),
                        fontSize = 20.sp,
                        modifier = modifier.padding(top = 26.dp)
                    )
                }

                item {
                    Image(painter = painterResource(Res.drawable.map_education),
                        contentDescription = "",
                        modifier = modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .padding(top = 8.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop,
                    )
                }

                items(educationLocation) {
                    locationItems(menuItem = it, modifier = modifier)
                }

                item {
                    Spacer(modifier = modifier.padding(top = 20.dp))
                }
            }
        }

        verticalLine(modifier = modifier.padding(horizontal = 10.dp, vertical = 30.dp))

        Column (modifier = modifier.weight(1f)){
            sideInfo()
        }
    }
}